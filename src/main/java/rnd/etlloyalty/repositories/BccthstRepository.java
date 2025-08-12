package rnd.etlloyalty.repositories;

import org.hibernate.mapping.Any;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rnd.etlloyalty.entities.BccthstRecord;

import java.util.List;

@Repository
public interface BccthstRepository extends JpaRepository<BccthstRecord, String> {
    @Query(value = "SELECT b.* FROM EPURSEPLUS.RND_CRDLNK_BCCTHST b", nativeQuery = true)
    List<BccthstRecord> selectAllBccthst();
    // change query to left join semua table
    @Query(value = """
                    SELECT 
                        b.THST_APPROVAL_CODE as approvalCode,
                        b.THST_CARD_NBR as cardNbr,
                        b.THST_ORG_NBR as cardOrg,
                        b.THST_TYPE as cardType,
                        b.THST_MERCH_CAT as merchCat,
                        b.THST_TRAN_CODE as tranCode,
                        b.THST_TRAN_AMT as tranAmount,
                        b.THST_TRAN_DATE as tranDate,
                        o.OASA_MERCHANT_NBR as merchantNbr,
                        o.OASA_MERCHANT_ORG as merchantOrg,
                        o.OASA_B019_CNTRY_CODE as countryCode
                    FROM
                        EPURSEPLUS.RND_CRDLNK_BCCTHST b
                    LEFT JOIN
                        EPURSEPLUS.RND_ODS_CRDLNK_OASLOG o ON b.THST_APPROVAL_CODE = o.OASA_B038_AUTH_CODE
                    LEFT JOIN 
                        EPURSEPLUS.RND
                    """,
            nativeQuery = true)
    Any selectJoinBccthstOaslog();
}
