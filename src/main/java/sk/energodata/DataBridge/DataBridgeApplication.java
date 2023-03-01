package sk.energodata.DataBridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DataBridgeApplication {

	public static void main(String[] args) {

		SpringApplication.run(DataBridgeApplication.class, args);
	}



}
