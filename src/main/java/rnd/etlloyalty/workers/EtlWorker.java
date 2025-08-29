package rnd.etlloyalty.workers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import rnd.etlloyalty.services.EtlTransactionService;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class EtlWorker implements CommandLineRunner {
    private final static Logger logger = LoggerFactory.getLogger(EtlWorker.class);

    private final EtlTransactionService etlTransactionService;
    private final ApplicationContext appContext;

    public EtlWorker(EtlTransactionService etlTransactionService, ApplicationContext appContext) {
        logger.info("ETL WORKER RUNNING");
        this.etlTransactionService = etlTransactionService;
        this.appContext = appContext;
    }

    @Override
    public void run(String... args) throws Exception {
        etlTransactionService.etlCcTransactions();

        // EXIT PROGRAM WHEN FINISHED
//        int exitCode = SpringApplication.exit(appContext, ()-> 0);
//        System.exit(exitCode);
    }


    //    @Scheduled(fixedRate = 2000)
    // RUN EVERY NIGHT AT 23 PM
    @Scheduled(cron = "0 0 23 * * ?")
    public void runScheduled() {
        logger.info("RUNNING SERVICE FROM SCHEDULER");
        etlTransactionService.etlCcTransactions();
    }
}
