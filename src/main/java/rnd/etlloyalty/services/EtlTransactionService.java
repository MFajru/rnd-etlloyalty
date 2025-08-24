package rnd.etlloyalty.services;

import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import rnd.etlloyalty.dto.CcTransactionDto;
import rnd.etlloyalty.entities.CcTransaction;
import rnd.etlloyalty.repositories.BccthstRepository;
import rnd.etlloyalty.repositories.CcTransactionRepository;

import java.util.*;

@Service
public class EtlTransactionService {
    int BATCH_SIZE = 100;
    int LIMIT = 100;

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

        List<CcTransactionDto> ccTrxsDto = bccthstRepository.selectCcTransactions();
        if (ccTrxsDto.isEmpty()) {
            logger.error("CC Transaction data is empty");
            return;
        }

        List<String> existingApprovalCodes = ccTransactionRepository.selectApprovalCodesWhereDateMinus1();
        int j = ccTrxsDto.size() - 1;
        if (!existingApprovalCodes.isEmpty()) {
            for (String existingApprovalCode : existingApprovalCodes) {
                while (j > 0){
                    if (Integer.parseInt(ccTrxsDto.get(j).getApprovalCode()) > Integer.parseInt(existingApprovalCode)) {
                        break;
                    }
                    if (Objects.equals(existingApprovalCode, ccTrxsDto.get(j).getApprovalCode())) {
                        ccTrxsDto.remove(j);
                    }
                    j -= 1;

                }
            }
        }

        List<CcTransaction> ccTrxs = new ArrayList<>();
        int batch = 0;
        for (CcTransactionDto ccTran: ccTrxsDto) {
            CcTransaction ccTrx = new CcTransaction();
            ccTrx.setTableId(String.format(ccTran.getApprovalCode() + ccTran.getTranCode()));
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
            ccTrx.setTerminalId(ccTran.getTerminalId());
            ccTrx.setCountryCode(ccTran.getCountryCode());
            ccTrx.setMerchantOrg(ccTran.getMerchantOrg());
            ccTrx.setMerchantId(ccTran.getMerchantId());
            ccTrx.setMerchantCat(ccTran.getMerchantCat());

            if (ccTrxs.size() >= BATCH_SIZE) {
                try {
                    ccTransactionRepository.saveAll(ccTrxs);
                    logger.info("Successing added data to db in batch {}",  (batch + ccTrxs.size() / BATCH_SIZE));
                } catch (DataAccessException e) {
                    logger.error("Database error occurred, transaction will be rolled back", e);
                } finally {
                    ccTrxs.clear();
                    batch += 1;
                }
            }
        }

        logger.info("Finish ETL CC Transaction Service");
    }
}
