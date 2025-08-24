package rnd.etlloyalty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import rnd.etlloyalty.entities.CcTransaction;

import java.util.List;
import java.util.Set;

public interface CcTransactionRepository extends JpaRepository<CcTransaction, String> {
    @Query(value = """
            SELECT cc.APPROVAL_CODE FROM RND_CC_TRX cc
            ORDER BY cc.TRAN_DATE
            OFFSET :offset
            ROWS FETCH NEXT :limit ROWS ONLY
            """,
            nativeQuery = true)
    List<String> selectApprovalCodesLimitOffset(@Param("limit") Integer limit, @Param("offset") Integer offset);

    @Query(value = """
            SELECT cc.APPROVAL_CODE FROM RND_CC_TRX cc
            """,
            nativeQuery = true)
    List<String> selectApprovalCodes();

    @Query(value = """
            SELECT * FROM RND_CC_TRX cc
            ORDER BY cc.TRAN_DATE
            OFFSET :offset
            ROWS FETCH NEXT :limit ROWS ONLY
            """,
            nativeQuery = true)
    Set<CcTransaction> selectLimitOffset(@Param("limit") Integer limit, @Param("offset") Integer offset);

    @Query(value = """
            SELECT cc.APPROVAL_CODE, cc.TRAN_CODE FROM RND_CC_TRX cc
            WHERE cc.TRAN_DATE = TO_CHAR(TRUNC(SYSDATE) - 1, 'DDMMYYYY')
            ORDER BY cc.APPROVAl_CODE ASC
            """,
            nativeQuery = true)
    List<String> selectApprovalCodesWhereDateMinus1();
}
