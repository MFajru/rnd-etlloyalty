package rnd.etlloyalty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EtlloyaltyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtlloyaltyApplication.class, args);
	}

}
