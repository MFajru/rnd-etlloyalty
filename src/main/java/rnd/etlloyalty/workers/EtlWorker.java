package rnd.etlloyalty.workers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import rnd.etlloyalty.services.EtlTransactionService;

@Component
public class EtlWorker implements CommandLineRunner {
    private final static Logger logger = LoggerFactory.getLogger(EtlWorker.class);

    private final EtlTransactionService etlTransactionService;
    private final ApplicationContext appContext;

    public EtlWorker(EtlTransactionService etlTransactionService, ApplicationContext appContext) {
        this.etlTransactionService = etlTransactionService;
        this.appContext = appContext;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("ETL WORKER RUNNING");
        etlTransactionService.etlCcTransactions();
        logger.info("ETL WORKER FINISHED");

        // EXIT PROGRAM WHEN FINISHED
        int exitCode = SpringApplication.exit(appContext, ()-> 0);
        System.exit(exitCode);
    }
}
