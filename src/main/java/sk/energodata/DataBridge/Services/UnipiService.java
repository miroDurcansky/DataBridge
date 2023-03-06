package sk.energodata.DataBridge.Services;

import eu.rcware.dev.esgdb.HistoryDbAccess;
import eu.rcware.dev.esgdb.HistoryDbAccessService;
import org.datacontract.schemas._2004._07.esg_db_server.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import sk.energodata.DataBridge.Model.Unipi;
import sk.energodata.DataBridge.Model.UnipiValue;
import sk.energodata.DataBridge.UnipiRepository;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class UnipiService {
    @Value("${unipi.username}")
    private String userName;

    @Value("${unipi.password}")
    private String userPassword;

    @Value("${unipi.mervisUrl}")
    private String dbUrl;
    static int index = 0;
    private UnipiRepository unipiRepository;

    private Boolean isAuth;
    List<String> variableNames;

    @Autowired
    public UnipiService(UnipiRepository unipiRepository) {
        this.unipiRepository = unipiRepository;
    }

    @PostConstruct
    public void init() {
        variableNames = new ArrayList<>();
        isAuth = Boolean.FALSE;
    }

    public void saveUnipi() throws DatatypeConfigurationException {
        getAllVariablesFromMervis();
        saveAllVariablesIntoPosgres();
        saveValsFromMervisIntoPostgres();
    }

    public void saveValsFromMervisIntoPostgres() throws DatatypeConfigurationException {

        org.datacontract.schemas._2004._07.esg_db_server.ObjectFactory of = new ObjectFactory();
        Credentials credentials = of.createCredentials();
        credentials.setName(of.createCredentialsName(userName));
        credentials.setPassword(of.createCredentialsPassword(userPassword));

        // *** Make WS-SOAP Client:
        HistoryDbAccessService srv = new HistoryDbAccessService();// wsdl is in file attached !!!
        HistoryDbAccess histAccess = srv.getHistoryAccess();
        BindingProvider bp = (BindingProvider) histAccess;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dbUrl);// !!! Set proper End-Piont URL !!

        // *** Confirm USER on ws-server:
        Boolean isAuth = histAccess.checkCredentials(credentials);
        System.out.println();
        System.out.println(isAuth ? "*** Ok, user's credentials are confirmed."
                : "!!! FAILED, user's credentials are unconfirmed !");

        if (isAuth) {
            Date current_date = new Date();
            Date old_date = new Date(100, 11, 21);
            GregorianCalendar gregorianCalendarCurrentDate = new GregorianCalendar();
            gregorianCalendarCurrentDate.setTime(current_date);
            GregorianCalendar gregorianCalendarOldDate = new GregorianCalendar();
            gregorianCalendarOldDate.setTime(old_date);
            XMLGregorianCalendar utcFrom = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(gregorianCalendarCurrentDate);
            XMLGregorianCalendar utcTo = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(gregorianCalendarOldDate);

            Integer variableOffset = 0;
            Integer variableCount = 10;
            Integer valueOffset = 0;
            Integer valueCount = 1000;

            Holder<ArrayOfMvr> getDataResult = new Holder<>();
            Holder<Integer> nextVariableOffset = new Holder<>();
            Holder<Integer> nextValueOffset = new Holder<>();
            Holder<String> returnCode = new Holder<>();

            ArrayOfArrayOfKeyValuePair variableKeys = new ArrayOfArrayOfKeyValuePair();
            int indexItemInVariableNames = 0;
            while (indexItemInVariableNames < variableNames.size()) {
                ArrayOfKeyValuePair arrayOfKeyValuePair = new ArrayOfKeyValuePair();
                KeyValuePair keyValuePair = new KeyValuePair();
                ObjectFactory objectFactoryKey = new ObjectFactory();
                JAXBElement<String> jaxbElementKey = objectFactoryKey.createKeyValuePairKey("VariableName");
                keyValuePair.setKey(jaxbElementKey);
                ObjectFactory objectFactoryValue = new ObjectFactory();
                JAXBElement<String> jaxbElementValue = objectFactoryValue.createKeyValuePairValue(variableNames.get(indexItemInVariableNames));
                keyValuePair.setValue(jaxbElementValue);
                keyValuePair.setIsKey(true);
                arrayOfKeyValuePair.getKeyValuePair().add(keyValuePair);
                variableKeys.getArrayOfKeyValuePair().add(arrayOfKeyValuePair);
                indexItemInVariableNames++;
            };

            histAccess.getData(credentials, variableKeys, utcFrom, utcTo, variableOffset, variableCount, valueOffset, valueCount,
                    getDataResult, nextVariableOffset, nextValueOffset, returnCode);

            ArrayOfMvr dataResultFromMerevisApi = getDataResult.value;


            List<Unipi> unipiList = (List<Unipi>) unipiRepository.findAll();
            Set<Unipi> unipiSet = unipiList.stream().collect(Collectors.toSet());

            for (int i = 0; i < dataResultFromMerevisApi.getMvr().size(); i++) {
                List<KeyValuePair> keyValuePairList = dataResultFromMerevisApi.getMvr().get(i).getKeys().getValue().getKeyValuePair();
                KeyValuePair keyValuePair = keyValuePairList.stream().filter(x -> x.getKey().getValue().equals("VariableName")).findFirst().get();

                String unipiVariableName = keyValuePair.getValue().getValue();

                Unipi akutalnaUnipi = unipiSet.stream().filter(x -> x.getName().equals(unipiVariableName)).findFirst().get();

                dataResultFromMerevisApi.getMvr().get(i).getVals().getValue().getI().forEach(x -> {
                    UnipiValue newValue = new UnipiValue();
                    newValue.setValid(Boolean.TRUE);
                    if(x.getDv() != null && x.getDv().getValue() != null) {
                        newValue.setValue(x.getDv().getValue());
                    } else {
                        newValue.setValue(0.0);
                    }

                    GregorianCalendar calendar = x.getGt().toGregorianCalendar();

                    LocalDateTime localDateTime = calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().truncatedTo(ChronoUnit.SECONDS);

                    newValue.setValueTime(localDateTime);

                    akutalnaUnipi.getUnipiValues().add(newValue);
                    Unipi nova = unipiRepository.save(akutalnaUnipi);
                });
            }
        }
    }

    private void saveAllVariablesIntoPosgres() {
        for (int i = 0; i < variableNames.size(); i++) {
            String name = variableNames.get(i);

            Optional<Unipi> existingUnipi = unipiRepository.findByName(name);

            if(!existingUnipi.isPresent()) {
                Unipi unipi = createUnipi(variableNames.get(i));
                unipiRepository.save(unipi);
            }
        }
    }

    private Unipi createUnipi(String name) {
        Unipi unipi = new Unipi();
        unipi.setName(name);
        unipi.setDescription("Vonkajšia teplota pri vchode do AB");
        unipi.setType("PHYSICAL");
        unipi.setPhysicalType("NUMERIC");
        unipi.setPhysicalDecimals(1);
        unipi.setPhysicalUnit("°C");
        unipi.setPhysicalMin(-55.5);
        unipi.setPhysicalMax(55.5);
        unipi.setPhysicalMinAlarm(-25.0);
        unipi.setPhysicalMaxAlarm(40.0);
        unipi.setPhysicalMinWarn(-15.0);
        unipi.setPhysicalMaxWarn(35.0);

        return unipi;
    }



    private void getAllVariablesFromMervis() {

        ObjectFactory of = new ObjectFactory();
        Credentials credentials = of.createCredentials();
        credentials.setName(of.createCredentialsName(userName));
        credentials.setPassword(of.createCredentialsPassword(userPassword));

        //Credentials credentials = getCredentials();
        // HistoryDbAccess histAccess = getHistoryDbAccess();

        HistoryDbAccessService srv = new HistoryDbAccessService();// wsdl is in file attached !!!
        HistoryDbAccess histAccess = srv.getHistoryAccess();
        BindingProvider bp = (BindingProvider) histAccess;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dbUrl);// !!! Set proper End-Piont URL !!

        // *** Confirm USER on ws-server:
        isAuth = histAccess.checkCredentials(credentials);
        System.out.println();
        System.out.println(isAuth ? "*** Ok, user's credentials are confirmed."
                : "!!! FAILED, user's credentials are unconfirmed !");

        if (isAuth) {
            System.out.println();
            System.out.println("*** Ok, read All Variables from " + dbUrl);
            Holder<ArrayOfVariableDescription> getAllVariablesResult = new Holder<>();
            Holder<Boolean> moreDataAvailable = new Holder<>();
            // READ ALL Variables:
            histAccess.getAllVariables(credentials, 0, 1000, getAllVariablesResult, moreDataAvailable);
            index = 0;
            getAllVariablesResult.value.getVariableDescription().forEach(vDesc -> {
                vDesc.getKeys().getValue().getKeyValuePair().forEach(kv -> {
                    if(kv.getKey().getValue().equals("VariableName"))
                        variableNames.add(kv.getValue().getValue());
                });
            });

        } else {
            System.out.println("authentication failed!");
        }
    }
    private HistoryDbAccess getHistoryDbAccess() {
        // *** Make WS-SOAP Client:
        HistoryDbAccessService srv = new HistoryDbAccessService();// wsdl is in file attached !!!
        HistoryDbAccess histAccess = srv.getHistoryAccess();
        BindingProvider bp = (BindingProvider) histAccess;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dbUrl);// !!! Set proper End-Piont URL !!
        return histAccess;
    }

    private Credentials getCredentials() {
        ObjectFactory of = new ObjectFactory();
        Credentials credentials = of.createCredentials();
        credentials.setName(of.createCredentialsName(userName));
        credentials.setPassword(of.createCredentialsPassword(userPassword));
        return credentials;
    }
}
