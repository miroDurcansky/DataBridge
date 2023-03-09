package sk.energodata.DataBridge.Jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import sk.energodata.DataBridge.Services.UnipiService;

import javax.xml.datatype.DatatypeConfigurationException;
import java.time.LocalTime;

@Component
public class SavingDataJob {
    @Autowired
    private UnipiService unipiService;
    @Scheduled(fixedRate = 1200000)
    public void savingDataJob() throws DatatypeConfigurationException {
        System.out.println("****** start loading data from Mervis  ******* time: " + LocalTime.now());
        unipiService.saveUnipi();
        System.out.println("****** Loaded data from Mervis and saved into local databse ******* time : " + LocalTime.now());

    }
}