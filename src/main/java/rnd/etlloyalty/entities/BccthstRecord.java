package rnd.etlloyalty.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "crdlnk_bccthst")
//@Table(name = "RND_CRDLNK_BCCTHST")
public class BccthstRecord {
    @Id
    @Column(name = "ROW_NO")
    private Long rowNo;

    @Column(name = "THST_APPROVAL_CODE")
    private String approvalCode;

    @Column(name = "AS_OF_DATE")
    private LocalDate asOfDate;

    @Column(name = "THST_ORG_NBR")
    private String orgNbr;

    @Column(name = "THST_TYPE")
    private String type;

    @Column(name = "THST_CARD_NBR")
    private String cardNbr;

    @Column(name = "THST_SEQ_NBR")
    private String seqNbr;

    @Column(name = "THST_POSTING_DATE")
    private LocalDate postingDate;

    @Column(name = "THST_DESCRIPTION")
    private String description;

    @Column(name = "THST_TRAN_CODE")
    private String tranCode;

    @Column(name = "THST_TRAN_DATE")
    private String tranDate;

    @Column(name = "THST_REF_NBR")
    private String refNbr;

    @Column(name = "THST_TRAN_AMT")
    private BigDecimal tranAmt;

    @Column(name = "THST_SOURCE_CODE")
    private String sourceCode;

    @Column(name = "THST_POS_MODE")
    private String posMode;

    @Column(name = "THST_INTERCHG_REF_NBR")
    private String interchgRefNbr;

    @Column(name = "THST_MERCH_CAT")
    private String merchCat;

    @Column(name = "THST_ORIG_CURR_CODE")
    private String origCurrCode;

    @Column(name = "THST_ORIG_CURR_AMT")
    private BigDecimal origCurrAmt;

    @Column(name = "THST_ORIG_CURR_DEC")
    private Integer origCurrDec;

    @Column(name = "THST_ONUS_CURR_CONV")
    private BigDecimal onusCurrConv;

    @Column(name = "THST_XBORDER_FEE")
    private BigDecimal xborderFee;

    @Column(name = "THST_MARKUP_AMT")
    private BigDecimal markupAmt;

    @Column(name = "THST_CCA_AMT")
    private BigDecimal ccaAmt;

    @Column(name = "THST_DCC_FLAG")
    private String dccFlag;

    @Column(name = "THST_MERCH_STATE")
    private String merchState;

    @Column(name = "THST_INTL_FEE_IND")
    private String intlFeeInd;

    @Column(name = "THST_REIMB_ATT")
    private String reimbAtt;

    @Column(name = "THST_STMT_DATE")
    private LocalDate stmtDate;

    @Column(name = "THST_STMT_NBR")
    private String stmtNbr;

    @Column(name = "THST_CURR_NAME")
    private String currName;

    @Column(name = "THST_POSTING_ACCT_NBR")
    private String postingAcctNbr;

    @Column(name = "LOAD_TIMESTAMP")
    private LocalDateTime loadTimestamp;

    @Column(name = "ETL_FLAG")
    private Integer etlFlag;

    @Column(name = "SRC_STM_ID")
    private String srcStmId;

    @Column(name = "MSR_PRD_ID")
    private String msrPrdId;

    @Column(name = "SRCTBLPRDID")
    private String srcTblPrdId;

    @Column(name = "KEY1")
    private String key1;

    public Long getRowNo() {
        return rowNo;
    }

    public void setRowNo(Long rowNo) {
        this.rowNo = rowNo;
    }

    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public LocalDate getAsOfDate() {
        return asOfDate;
    }

    public void setAsOfDate(LocalDate asOfDate) {
        this.asOfDate = asOfDate;
    }

    public String getOrgNbr() {
        return orgNbr;
    }

    public void setOrgNbr(String orgNbr) {
        this.orgNbr = orgNbr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCardNbr() {
        return cardNbr;
    }

    public void setCardNbr(String cardNbr) {
        this.cardNbr = cardNbr;
    }

    public String getSeqNbr() {
        return seqNbr;
    }

    public void setSeqNbr(String seqNbr) {
        this.seqNbr = seqNbr;
    }

    public LocalDate getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(LocalDate postingDate) {
        this.postingDate = postingDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }

    public String getRefNbr() {
        return refNbr;
    }

    public void setRefNbr(String refNbr) {
        this.refNbr = refNbr;
    }

    public BigDecimal getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(BigDecimal tranAmt) {
        this.tranAmt = tranAmt;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getPosMode() {
        return posMode;
    }

    public void setPosMode(String posMode) {
        this.posMode = posMode;
    }

    public String getInterchgRefNbr() {
        return interchgRefNbr;
    }

    public void setInterchgRefNbr(String interchgRefNbr) {
        this.interchgRefNbr = interchgRefNbr;
    }

    public String getMerchCat() {
        return merchCat;
    }

    public void setMerchCat(String merchCat) {
        this.merchCat = merchCat;
    }

    public String getOrigCurrCode() {
        return origCurrCode;
    }

    public void setOrigCurrCode(String origCurrCode) {
        this.origCurrCode = origCurrCode;
    }

    public BigDecimal getOrigCurrAmt() {
        return origCurrAmt;
    }

    public void setOrigCurrAmt(BigDecimal origCurrAmt) {
        this.origCurrAmt = origCurrAmt;
    }

    public Integer getOrigCurrDec() {
        return origCurrDec;
    }

    public void setOrigCurrDec(Integer origCurrDec) {
        this.origCurrDec = origCurrDec;
    }

    public BigDecimal getOnusCurrConv() {
        return onusCurrConv;
    }

    public void setOnusCurrConv(BigDecimal onusCurrConv) {
        this.onusCurrConv = onusCurrConv;
    }

    public BigDecimal getXborderFee() {
        return xborderFee;
    }

    public void setXborderFee(BigDecimal xborderFee) {
        this.xborderFee = xborderFee;
    }

    public BigDecimal getMarkupAmt() {
        return markupAmt;
    }

    public void setMarkupAmt(BigDecimal markupAmt) {
        this.markupAmt = markupAmt;
    }

    public BigDecimal getCcaAmt() {
        return ccaAmt;
    }

    public void setCcaAmt(BigDecimal ccaAmt) {
        this.ccaAmt = ccaAmt;
    }

    public String getDccFlag() {
        return dccFlag;
    }

    public void setDccFlag(String dccFlag) {
        this.dccFlag = dccFlag;
    }

    public String getMerchState() {
        return merchState;
    }

    public void setMerchState(String merchState) {
        this.merchState = merchState;
    }

    public String getIntlFeeInd() {
        return intlFeeInd;
    }

    public void setIntlFeeInd(String intlFeeInd) {
        this.intlFeeInd = intlFeeInd;
    }

    public String getReimbAtt() {
        return reimbAtt;
    }

    public void setReimbAtt(String reimbAtt) {
        this.reimbAtt = reimbAtt;
    }

    public LocalDate getStmtDate() {
        return stmtDate;
    }

    public void setStmtDate(LocalDate stmtDate) {
        this.stmtDate = stmtDate;
    }

    public String getStmtNbr() {
        return stmtNbr;
    }

    public void setStmtNbr(String stmtNbr) {
        this.stmtNbr = stmtNbr;
    }

    public String getCurrName() {
        return currName;
    }

    public void setCurrName(String currName) {
        this.currName = currName;
    }

    public String getPostingAcctNbr() {
        return postingAcctNbr;
    }

    public void setPostingAcctNbr(String postingAcctNbr) {
        this.postingAcctNbr = postingAcctNbr;
    }

    public LocalDateTime getLoadTimestamp() {
        return loadTimestamp;
    }

    public void setLoadTimestamp(LocalDateTime loadTimestamp) {
        this.loadTimestamp = loadTimestamp;
    }

    public Integer getEtlFlag() {
        return etlFlag;
    }

    public void setEtlFlag(Integer etlFlag) {
        this.etlFlag = etlFlag;
    }

    public String getSrcStmId() {
        return srcStmId;
    }

    public void setSrcStmId(String srcStmId) {
        this.srcStmId = srcStmId;
    }

    public String getMsrPrdId() {
        return msrPrdId;
    }

    public void setMsrPrdId(String msrPrdId) {
        this.msrPrdId = msrPrdId;
    }

    public String getSrcTblPrdId() {
        return srcTblPrdId;
    }

    public void setSrcTblPrdId(String srcTblPrdId) {
        this.srcTblPrdId = srcTblPrdId;
    }

    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }
}
