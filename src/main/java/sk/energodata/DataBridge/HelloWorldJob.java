package sk.energodata.DataBridge;

import eu.rcware.dev.esgdb.HistoryDbAccess;
import eu.rcware.dev.esgdb.HistoryDbAccessService;
import org.datacontract.schemas._2004._07.esg_db_server.ArrayOfVariableDescription;
import org.datacontract.schemas._2004._07.esg_db_server.Credentials;
import org.datacontract.schemas._2004._07.esg_db_server.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import sk.energodata.DataBridge.Services.UnipiService;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class HelloWorldJob {

    private static final String USER_NAME = "unipi_02819";
    private static final String USER_PASSWORD = "wzY6MAWk";
    private static final String DB_URL = "http://db.unipi.technology/dbaccess";
    static int index;
    @Autowired
    private BranchOneToManyTestRepository testRepository;
    @Autowired
    private UnipiService unipiService;
    @Scheduled(fixedRate = 60000)
    public void sayHelloWorld() throws InterruptedException {

        unipiService.saveUnipi();

        List<String> variableNames = new ArrayList<>();
        // *** Make user's credentials:
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

        Iterable<Branch> list = testRepository.findAll();

        Branch branch = new Branch();
        branch.setBranchShortName("CSE");
        branch.setBranchName("Computer Science and Engineering");
        branch.setDescription("ľščťžý súä ľ šččťžžžýýáííéé é Ďakujem nie je za čo!");
        Set<Student> students = new HashSet<>();
        students.add(getStudent1());
        students.add(getStudent2());
        branch.setStudents(students);
        Branch createdBranch = testRepository.save(branch);
        System.err.println(createdBranch);

        System.out.println("Cau Mirko!");
    }

    private static Student getStudent1() {
        Student student = new Student();
        student.setFirstName("Rosy");
        student.setLastName("Larsen");
        student.setContactNo("+1-408-575-1317");
        student.setStudentTime(LocalDateTime.of(2022, Month.AUGUST, 15, 10, 25, 45));
        return student;
    }
    private static Student getStudent2() {
        Student student = new Student();
        student.setFirstName("Rosy");
        student.setLastName("Larsen");
        student.setContactNo("+1-408-575-1219");
        student.setStudentTime(LocalDateTime.of(2022, Month.JULY, 15, 10, 25, 45));
        return student;
    }
}