package sk.energodata.DataBridge.Services;

import eu.rcware.dev.esgdb.HistoryDbAccess;
import eu.rcware.dev.esgdb.HistoryDbAccessService;
import org.datacontract.schemas._2004._07.esg_db_server.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import sk.energodata.DataBridge.Models.Unipi;
import sk.energodata.DataBridge.Models.UnipiValue;
import sk.energodata.DataBridge.Repository.UnipiRepository;
import sk.energodata.DataBridge.Repository.UnipiValueRepository;
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

@Service
public class UnipiService {
    @Value("${unipi.username}")
    private String userName;
    @Value("${unipi.password}")
    private String userPassword;
    @Value("${unipi.mervisUrl}")
    private String dbUrl;
    private UnipiRepository unipiRepository;
    private UnipiDataAccess unipiDataAccess;
    private Boolean isAuth = Boolean.FALSE;
    private List<Unipi> unipisWithoutValues;
    private Credentials credentials;
    private HistoryDbAccess histAccess;
    private UnipiValueRepository unipiValueRepository;
    List<String> variableNames;
    static int index = 0;

    @Autowired
    public UnipiService(UnipiRepository unipiRepository, UnipiDataAccess unipiDataAccess, UnipiValueRepository unipiValueRepository) {
        this.unipiRepository = unipiRepository;
        this.unipiDataAccess = unipiDataAccess;
        this.unipiValueRepository = unipiValueRepository;
    }
    @PostConstruct
    public void init() {
        this.variableNames = new ArrayList<>();
        this.credentials =  getCredentials();
        this.histAccess = getHistoryDbAccess();
        this.isAuth = histAccess.checkCredentials(credentials);
        this.unipisWithoutValues = new ArrayList<>();
    }

    public void saveUnipi() throws DatatypeConfigurationException {
        getAllVariablesFromMervis();
        saveAllVariablesIntoPosgresDb();
        saveValsFromMervisIntoPostgres();
    }
    private void saveValsFromMervisIntoPostgres() throws DatatypeConfigurationException {
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

            for (int i = 0; i < dataResultFromMerevisApi.getMvr().size(); i++) {
                List<KeyValuePair> keyValuePairList = dataResultFromMerevisApi.getMvr().get(i).getKeys().getValue().getKeyValuePair();
                KeyValuePair keyValuePair = keyValuePairList.stream().filter(x -> x.getKey().getValue().equals("VariableName")).findFirst().get();
                String unipiVariableName = keyValuePair.getValue().getValue();
                Unipi selectedUnipiByName = unipisWithoutValues.stream().filter(x -> x.getName().equals(unipiVariableName)).findFirst().get();
                dataResultFromMerevisApi.getMvr().get(i).getVals().getValue().getI().forEach(x -> {
                    UnipiValue newUnipiValue = new UnipiValue();
                    newUnipiValue.setValid(Boolean.TRUE);
                    if(x.getDv() != null && x.getDv().getValue() != null) {
                        newUnipiValue.setValue(x.getDv().getValue());
                    } else {
                        newUnipiValue.setValue(0.0);
                    }
                    GregorianCalendar calendar = x.getGt().toGregorianCalendar();
                    LocalDateTime localDateTime = calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().truncatedTo(ChronoUnit.SECONDS);
                    newUnipiValue.setValueTime(localDateTime);
                    newUnipiValue.setDescsId(selectedUnipiByName.getId());

                    Long id = unipiValueRepository.count();
                    unipiValueRepository.saveOrUpdateValue(id, newUnipiValue.getValueTime(), selectedUnipiByName.getId()
                            , newUnipiValue.getValue(), Boolean.TRUE);

                });
            }
        }
    }
    private void saveAllVariablesIntoPosgresDb() {
        this.unipisWithoutValues = unipiDataAccess.getAllUnipiWithoutValues();
        for (int i = 0; i < variableNames.size(); i++) {
            String name = variableNames.get(i);
            Optional<Unipi> existingUnipi = unipisWithoutValues.stream().filter(x -> x.getName().equals(name)).findFirst();

            if(!existingUnipi.isPresent()) {
                Unipi unipi = createUnipi(variableNames.get(i));
                unipiRepository.save(unipi);
            }
        }
        this.unipisWithoutValues = unipiDataAccess.getAllUnipiWithoutValues();
    }
    private void getAllVariablesFromMervis() {
        if (isAuth) {
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
