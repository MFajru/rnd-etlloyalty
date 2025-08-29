package rnd.etlloyalty.services;

import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import rnd.etlloyalty.dto.CcTransactionDto;
import rnd.etlloyalty.entities.CcTransaction;
import rnd.etlloyalty.entities.EtlRunningLog;
import rnd.etlloyalty.repositories.BccthstRepository;
import rnd.etlloyalty.repositories.CcTransactionRepository;
import rnd.etlloyalty.repositories.EtlRunningLogRepository;

import java.util.*;

@Service
public class EtlTransactionService {
    int BATCH_SIZE = 100;
    int LIMIT = 100;

    private final static Logger logger = LoggerFactory.getLogger(EtlTransactionService.class);

    private final BccthstRepository bccthstRepository;
    private final CcTransactionRepository ccTransactionRepository;
    private final EtlRunningLogRepository etlRunningLogRepository;

    public EtlTransactionService(BccthstRepository bccthstRepository, CcTransactionRepository ccTransactionRepository, EtlRunningLogRepository etlRunningLogRepository) {
        this.bccthstRepository = bccthstRepository;
        this.ccTransactionRepository = ccTransactionRepository;
        this.etlRunningLogRepository = etlRunningLogRepository;
    }

    @Transactional
    public void etlCcTransactions() {
        logger.info("Start ETL CC Transaction Service");
        int successAmt = 0;
        int failedAmt = 0;
        EtlRunningLog etlRunningLog = new EtlRunningLog();
        etlRunningLog.setEtlStartTimestamp(etlRunningLogRepository.getDbDateTime());

        List<CcTransactionDto> ccTrxsDto = bccthstRepository.selectCcTransactions();
        if (ccTrxsDto.isEmpty()) {
            logger.warn("CC Transaction data is empty");
            etlRunningLog.setEtlFinishTimestamp(etlRunningLogRepository.getDbDateTime());
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

        etlRunningLog.setEtlDataAmt(ccTrxsDto.size());

        List<CcTransaction> ccTrxs = new ArrayList<>();
        int batch = 0;
        for (int i = 0; i < ccTrxsDto.size(); i++) {
            CcTransaction ccTrx = new CcTransaction();
            ccTrx.setTableId(String.format(ccTrxsDto.get(i).getApprovalCode() + ccTrxsDto.get(i).getTranCode()));
            ccTrx.setApprovalCode(ccTrxsDto.get(i).getApprovalCode());
            ccTrx.setTranCode(ccTrxsDto.get(i).getTranCode());
            ccTrx.setTranCodeDesc(ccTrxsDto.get(i).getTranCodeDesc());
            ccTrx.setTranFeature(ccTrxsDto.get(i).getTranFeature());
            ccTrx.setChannel(ccTrxsDto.get(i).getChannel());
            ccTrx.setUtilCode(ccTrxsDto.get(i).getUtilCode());
            ccTrx.setTranDate(ccTrxsDto.get(i).getTranDate());
            ccTrx.setTranAmount(ccTrxsDto.get(i).getTranAmount());
            ccTrx.setCardOrg(ccTrxsDto.get(i).getCardOrg());
            ccTrx.setCardType(ccTrxsDto.get(i).getCardType());
            ccTrx.setCardNumber(ccTrxsDto.get(i).getCardNumber());
            ccTrx.setTerminalId(ccTrxsDto.get(i).getTerminalId());
            ccTrx.setCountryCode(ccTrxsDto.get(i).getCountryCode());
            ccTrx.setMerchantOrg(ccTrxsDto.get(i).getMerchantOrg());
            ccTrx.setMerchantId(ccTrxsDto.get(i).getMerchantId());
            ccTrx.setMerchantCat(ccTrxsDto.get(i).getMerchantCat());

            ccTrxs.add(ccTrx);

            if (ccTrxs.size() >= BATCH_SIZE || i >= ccTrxsDto.size()-1) {
                try {
                    ccTransactionRepository.saveAll(ccTrxs);
                    successAmt += ccTrxs.size();
                    logger.info("Successing added data to db in batch {}",  (i / BATCH_SIZE) + 1);
                } catch (DataAccessException e) {
                    failedAmt += ccTrxs.size();
                    logger.error("Database error occurred, transaction will be rolled back", e);
                } finally {
                    ccTrxs.clear();
                    existingApprovalCodes.clear();
                    batch += 1;
                }
            }
        }

        etlRunningLog.setEtlSuccessAmt(successAmt);
        etlRunningLog.setEtlFailedAmt(failedAmt);
        etlRunningLog.setEtlFinishTimestamp(etlRunningLogRepository.getDbDateTime());
        etlRunningLogRepository.save(etlRunningLog);

        logger.info("Finish ETL CC Transaction Service");
    }
}
