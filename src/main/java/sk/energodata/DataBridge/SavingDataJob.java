package sk.energodata.DataBridge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import sk.energodata.DataBridge.Services.UnipiService;

import javax.xml.datatype.DatatypeConfigurationException;
import java.time.LocalTime;

@Component
public class SavingDataJob {
    static int index;
    @Autowired
    private UnipiService unipiService;
    @Scheduled(fixedRate = 60000)
    public void savingDataJob() throws DatatypeConfigurationException {

        unipiService.saveUnipi();
        System.out.println("Loaded data from Mervis" + LocalTime.now());

    }
}