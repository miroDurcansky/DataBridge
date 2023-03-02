package sk.energodata.DataBridge.Services;

import eu.rcware.dev.esgdb.HistoryDbAccess;
import eu.rcware.dev.esgdb.HistoryDbAccessService;
import org.datacontract.schemas._2004._07.esg_db_server.ArrayOfVariableDescription;
import org.datacontract.schemas._2004._07.esg_db_server.Credentials;
import org.datacontract.schemas._2004._07.esg_db_server.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.energodata.DataBridge.UnipiRepository;

import javax.annotation.PostConstruct;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import java.util.ArrayList;
import java.util.List;

@Service
public class UnipiService {

    private static final String USER_NAME = "";
    private static final String USER_PASSWORD = "";
    private static final String DB_URL = "http://db.unipi.technology/dbaccess";
    static int index = 0;
    private UnipiRepository unipiRepository;

    List<String> variableNames;

    @Autowired
    public UnipiService(UnipiRepository unipiRepository) {
        this.unipiRepository = unipiRepository;
    }

    @PostConstruct
    public void init() {
        variableNames = new ArrayList<>();
    }

    public void getVariableNames() {
        org.datacontract.schemas._2004._07.esg_db_server.ObjectFactory of = new ObjectFactory();
        Credentials credentials = of.createCredentials();
        credentials.setName(of.createCredentialsName(USER_NAME));
        credentials.setPassword(of.createCredentialsPassword(USER_PASSWORD));

        // *** Make WS-SOAP Client:
        HistoryDbAccessService srv = new HistoryDbAccessService();// wsdl is in file attached !!!
        HistoryDbAccess histAccess = srv.getHistoryAccess();
        BindingProvider bp = (BindingProvider) histAccess;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, DB_URL);// !!! Set proper End-Piont URL !!

        // *** Confirm USER on ws-server:
        Boolean isAuth = histAccess.checkCredentials(credentials);
        System.out.println();
        System.out.println(isAuth ? "*** Ok, user's credentials are confirmed."
                : "!!! FAILED, user's credentials are unconfirmed !");

        if (isAuth) {
            System.out.println();
            System.out.println("*** Ok, read All Variables from " + DB_URL);
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
}
