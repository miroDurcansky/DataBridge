package sk.energodata.DataBridge;

import eu.rcware.dev.esgdb.HistoryDbAccess;
import eu.rcware.dev.esgdb.HistoryDbAccessService;
import org.datacontract.schemas._2004._07.esg_db_server.*;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.concurrent.atomic.AtomicInteger;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

public class Test {

    public static void main(String[] args) throws DatatypeConfigurationException {

        final String USER_NAME = "unipi_02819";
        final String USER_PASSWORD = "wzY6MAWk";
        final String DB_URL = "http://db.unipi.technology/dbaccess";
        AtomicInteger index = new AtomicInteger();

        // *** Make user's credentials:
        ObjectFactory of = new ObjectFactory();
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
            histAccess.getAllVariables(credentials, 0, 11, getAllVariablesResult, moreDataAvailable);
            index.set(0);
            getAllVariablesResult.value.getVariableDescription().forEach(vDesc -> {
                System.out.println("#" + (index.incrementAndGet()) + ". Variable Description block has "
                        + vDesc.getKeys().getValue().getKeyValuePair().size() + " KEY-VALUE PAIRS:");
                vDesc.getKeys().getValue().getKeyValuePair().forEach(kv -> {
                    String key = kv.getKey().getValue();
                    String val = kv.getValue().getValue();
                    System.out.println("\tKey='" + key + "'...value='" + val + "'");
                });
                System.out
                        .println("--------------------------------------------------------" + "---------------------");
            });
            System.out.println("+++ END +++");
        } // if isAuth

    }// *** main +++

}// +++ MAIN-CLASS +++