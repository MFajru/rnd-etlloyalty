package rnd.etlloyalty.services;

import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import rnd.etlloyalty.dto.CcTransactionDto;
import rnd.etlloyalty.entities.BccthstRecord;
import rnd.etlloyalty.entities.CcTransaction;
import rnd.etlloyalty.repositories.BccthstRepository;
import rnd.etlloyalty.repositories.CcTransactionRepository;
import rnd.etlloyalty.repositories.OaslogRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EtlTransactionService {

    private final static Logger logger = LoggerFactory.getLogger(EtlTransactionService.class);

    private final BccthstRepository bccthstRepository;
    private final CcTransactionRepository ccTransactionRepository;

    public EtlTransactionService(BccthstRepository bccthstRepository, CcTransactionRepository ccTransactionRepository) {
        this.bccthstRepository = bccthstRepository;
        this.ccTransactionRepository = ccTransactionRepository;
    }

    @Transactional
    public void etlCcTransactions() {
        logger.info("Start ETL CC Transaction Service");
        List<CcTransactionDto> ccTransactions = bccthstRepository.selectCcTransactions();
        List<CcTransaction> ccTrxs = new ArrayList<>();

        for (CcTransactionDto ccTran: ccTransactions) {
            CcTransaction ccTrx = new CcTransaction();
            ccTrx.setApprovalCode(ccTran.getApprovalCode());
            ccTrx.setTranCode(ccTran.getTranCode());
            ccTrx.setTranCodeDesc(ccTran.getTranCodeDesc());
            ccTrx.setTranFeature(ccTran.getTranFeature());
            ccTrx.setChannel(ccTran.getChannel());
            ccTrx.setUtilCode(ccTran.getUtilCode());
            ccTrx.setTranDate(ccTran.getTranDate());
            ccTrx.setTranAmount(ccTran.getTranAmount());
            ccTrx.setCardOrg(ccTran.getCardOrg());
            ccTrx.setCardType(ccTran.getCardType());
            ccTrx.setCardNumber(ccTran.getCardNumber());
            ccTrx.setTerminalCode(ccTran.getTerminalCode());
            ccTrx.setCountryCode(ccTran.getCountryCode());
            ccTrx.setMerchantOrg(ccTran.getMerchantOrg());
            ccTrx.setMerchantId(ccTran.getMerchantId());
            ccTrx.setMerchantCat(ccTran.getMerchantCat());

            ccTrxs.add(ccTrx);
        }

        logger.info("Finish ETL CC Transaction Service");
        return ;

    }
}
