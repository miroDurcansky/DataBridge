package sk.energodata.DataBridge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import sk.energodata.DataBridge.Services.UnipiService;

import javax.xml.datatype.DatatypeConfigurationException;

@Component
public class HelloWorldJob {

    @Value("${unipi.username}")
    private String USER_NAME;

    @Value("${unipi.password}")
    private String USER_PASSWORD;

    @Value("${unipi.mervisUrl}")
    private String DB_URL;
    static int index;
    @Autowired
    private BranchOneToManyTestRepository testRepository;
    @Autowired
    private UnipiService unipiService;
    @Scheduled(fixedRate = 60000)
    public void savingDataJob() throws DatatypeConfigurationException {

        System.out.println("Loading data from Mervis");
        unipiService.saveUnipi();

    }
}