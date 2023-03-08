package sk.energodata.DataBridge.Services;

import eu.rcware.dev.esgdb.HistoryDbAccess;
import eu.rcware.dev.esgdb.HistoryDbAccessService;
import org.datacontract.schemas._2004._07.esg_db_server.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import sk.energodata.DataBridge.Models.Student;
import sk.energodata.DataBridge.Models.Subject;
import sk.energodata.DataBridge.Models.Unipi;
import sk.energodata.DataBridge.Models.UnipiValue;
import sk.energodata.DataBridge.Repository.StudentRepository;
import sk.energodata.DataBridge.Repository.UnipiRepository;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import org.springframework.jdbc.core.ResultSetExtractor;

@Service
public class UnipiService {
    @Value("${unipi.username}")
    private String userName;

    @Value("${unipi.password}")
    private String userPassword;

    @Value("${unipi.mervisUrl}")
    private String dbUrl;
    private JdbcTemplate jdbcTemplate;
        static int index = 0;
    private UnipiRepository unipiRepository;

    private StudentRepository studentRepository;
    private Boolean isAuth;
    List<String> variableNames;

    @Autowired
    public UnipiService(UnipiRepository unipiRepository, JdbcTemplate jdbcTemplate, StudentRepository studentRepository) {
        this.unipiRepository = unipiRepository;
        this.jdbcTemplate = jdbcTemplate;
        this.studentRepository = studentRepository;
    }

    @PostConstruct
    public void init() {
        variableNames = new ArrayList<>();
        isAuth = Boolean.FALSE;
    }

    public void saveUnipi() throws DatatypeConfigurationException {

        Subject subject = new Subject();
        subject.setSubject("telesna");
        subject.setValueTime(LocalDateTime.now());

        Subject subject2 = new Subject();
        subject2.setSubject("nemcina");
        subject2.setValueTime(LocalDateTime.now().minusMinutes(30));

        Set<Subject> set = new HashSet<>();
        set.add(subject2);
        set.add(subject);

        Student studentDb = new Student();
        studentDb.setName("mirko");
        studentDb.setDepartment("IT");
        studentDb.setSubjectSet(set);

        //studentRepository.save(studentDb);
        System.out.println("ulozene");




//        List<Student> studentDetailList = jdbcTemplate.query("SELECT * FROM student", rs -> {
//            List<Student> studentDetailList1 = new ArrayList<Student>();
//            while(rs.next()) {
//                Student student = new Student();
//                // 1, 2 and 3 are the indices of the data present
//                // in the database respectively
//                student.setId(rs.getInt(1));
//                student.setName(rs.getString(2));
//                //student.setDepartment(rs.getString(3));
//                studentDetailList1.add(student);
//            }
//            return studentDetailList1;
//        });



        List<Student> students = getAllStudentDetailsWithSubjects(LocalDateTime.now().minusMinutes(20), LocalDateTime.now());



        getAllVariablesFromMervis();
        saveAllVariablesIntoPosgres();
        saveValsFromMervisIntoPostgres();
    }

    public List<Student> getAllStudentDetailsWithSubjects(LocalDateTime startDate,LocalDateTime endDate) {

        // Implementation of ResultSetExtractor interface
        return jdbcTemplate.query("SELECT * FROM student st, subject sb where st.id = sb.student_id and sb.value_time BETWEEN ? AND ?", new Object[]{startDate, endDate}, new ResultSetExtractor<List<Student>>() {

            // extractData() is ResultSetExtractor
            // interface's method
            public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
                Map<Integer, Student> studentMap = new HashMap<>(); // mapa študentov
                while(rs.next()) {
                    int studentId = rs.getInt(1);
                    Student student;
                    if (!studentMap.containsKey(studentId)) { // ak sa študent ešte nenachádza v mape, vytvoríme ho
                        student = new Student();
                        student.setId(studentId);
                        student.setName(rs.getString("name"));
                        student.setDepartment(rs.getString("department"));
                        student.setSubjectSet(new HashSet<>());
                        studentMap.put(studentId, student);
                    } else { // ak sa študent už nachádza v mape, získame ho z mapy
                        student = studentMap.get(studentId);
                    }
                    Subject subject = new Subject(); // vytvoríme nový predmet
                    subject.setId(rs.getLong(4));
                    subject.setValueTime(rs.getTimestamp("value_time").toLocalDateTime());
                    subject.setSubject(rs.getString("subject"));
                    subject.setStudentId(Long.valueOf(studentId));
                    student.getSubjectSet().add(subject); // pridáme predmet do množiny študenta
                }
                return new ArrayList<>(studentMap.values());
            }

        });
    }

    public void saveValsFromMervisIntoPostgres() throws DatatypeConfigurationException {
        Credentials credentials = getCredentials();
        HistoryDbAccess histAccess = getHistoryDbAccess();

        // *** Confirm USER on ws-server:
        Boolean isAuth = histAccess.checkCredentials(credentials);

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

                Unipi selectedUnipiByName = unipiSet.stream().filter(x -> x.getName().equals(unipiVariableName)).findFirst().get();

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

                    if(newValue.getValue() != 0.0) {
                        selectedUnipiByName.getUnipiValues().add(newValue);
                        unipiRepository.save(selectedUnipiByName);
                    }
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
         Credentials credentials = getCredentials();
         HistoryDbAccess histAccess = getHistoryDbAccess();

        // *** Confirm USER on ws-server:
        isAuth = histAccess.checkCredentials(credentials);

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
