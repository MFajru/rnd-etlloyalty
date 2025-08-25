package rnd.etlloyalty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import rnd.etlloyalty.dto.CcTransactionDto;
import rnd.etlloyalty.entities.BccthstRecord;

import java.util.List;

@Repository
public interface BccthstRepository extends JpaRepository<BccthstRecord, String> {
    @Query(value = "SELECT b.* FROM EPURSEPLUS.RND_CRDLNK_BCCTHST b", nativeQuery = true)
    List<BccthstRecord> selectAllBccthst();

    @Query(value = """
            SELECT b.THST_APPROVAL_CODE AS approvalCode, b.THST_TRAN_CODE AS tranCode,
                   CASE
                    	WHEN b.THST_TRAN_CODE = '40' THEN 'RETAIL PURCHASE'
                    	WHEN b.THST_TRAN_CODE = '41' THEN 'REFUND RETAIL PURCHASE'
                    	WHEN b.THST_TRAN_CODE = '65' THEN 'CREDIT CARD INSURANCE'
                    	WHEN b.THST_TRAN_CODE = '66' THEN 'REFUND CREDIT CARD INSURANCE'
                    	ELSE 'Unknown'
                    END AS tranCodeDesc,
                    CONCAT(
                    	CASE
                    		WHEN INSTR(bn.BNICA_F060_BANK_HEADER, 'APISPC') > 0 THEN 'BILL PAYMENT-'
                    		ELSE 'PURCHASE-'
                    	END,
                    	b.THST_DESCRIPTION
                    ) AS tranFeature,
                    CASE
                    	WHEN bn.BNICA_F038_AUTH_CDE IS NOT NULL THEN 'Wondr'
                    	WHEN o.OADCL_APPROVAL_CODE IS NOT NULL THEN 'EDC'
                    	ELSE 'Unknown'
                    END AS channel,
                    SUBSTR(bn.BNICA_F060_BANK_HEADER, INSTR(bn.BNICA_F060_BANK_HEADER, 'APISPC') + 6, 4) AS utilCode,
                    b.THST_TRAN_DATE AS tranDate, b.THST_TRAN_AMT AS tranAmount,
                    b.THST_ORG_NBR as cardOrg, b.THST_TYPE AS cardType, b.THST_CARD_NBR AS cardNumber,
                    os.OASA_B019_CNTRY_CODE AS countryCode,
                    CONCAT(os.OASA_B041_CRD_ACCPT_STORE, os.OASA_B041_CRD_ACCPT_TERM) AS terminalId,
                    os.OASA_MERCHANT_ORG AS merchantOrg, os.OASA_MERCHANT_NBR AS merchantId, b.THST_MERCH_CAT AS merchantCat
            FROM RND_ODS_CRDLNK_BCCTHST b
            LEFT JOIN RND_ODS_CRDLNK_OASLOG os ON b.THST_APPROVAL_CODE = os.OASA_B038_AUTH_CODE
            LEFT JOIN RND_ODS_CRDLNK_BNLOG_ATM bn ON b.THST_APPROVAL_CODE = bn.BNICA_F038_AUTH_CDE
            LEFT JOIN RND_ODS_CRDLNK_OADCLOG o ON b.THST_APPROVAL_CODE = o.OADCL_APPROVAL_CODE
            WHERE b.THST_TRAN_DATE = TO_CHAR(TRUNC(SYSDATE) - 1, 'DDMMYYYY')
            ORDER BY b.THST_APPROVAL_CODE DESC
            """,
            nativeQuery = true)
    List<CcTransactionDto> selectCcTransactions();

}
