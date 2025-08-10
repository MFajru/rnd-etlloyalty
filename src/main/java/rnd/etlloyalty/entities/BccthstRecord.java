package rnd.etlloyalty.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "crdlnk_bccthst")
public class BccthstRecord {
    @Id
    @Column(name = "THST-APPR-CODE")
    private String apprCode;

    @Column(name = "THST-SEQ-NBR")
    private String seqNbr;

    @Column(name = "THST-XBORDER-FEE")
    private String xborderFee;

    @Column(name = "THST-TYPE")
    private String type;

    @Column(name = "THST-TRAN-DATE")
    private String tranDate;

    @Column(name = "THST-TRAN-CODE")
    private String tranCode;

    @Column(name = "THST-TRAN-AMT")
    private String tranAmt;

    @Column(name = "THST-STMT-NBR")
    private String stmtNbr;

    @Column(name = "THST-STMT-DATE")
    private String stmtDate;

    @Column(name = "THST-SOURCE-CODE")
    private String sourceCode;

    @Column(name = "THST-REIMB-ATT")
    private String reimbAtt;

    @Column(name = "THST-REF-SEQ")
    private String refSeq;

    @Column(name = "THST-REF-NBR-R")
    private String refNbrR;

    @Column(name = "THST-REF-NBR")
    private String refNbr;

    @Column(name = "THST-REF-DTE")
    private String refDte;

    @Column(name = "THST-REF-BATCH")
    private String refBatch;

    @Column(name = "THST-POSTING-DATE")
    private String postingDate;

    @Column(name = "THST-POSTING-ACCT-NBR")
    private String postingAcctNbr;

    @Column(name = "THST-POS-MODE")
    private String posMode;

    @Column(name = "THST-ORIG-CURR-DEC")
    private String origCurrDec;

    @Column(name = "THST-ORIG-CURR-CODE")
    private String origCurrCode;

    @Column(name = "THST-ORIG-CURR-AMT-D")
    private String origCurrAmtD;

    @Column(name = "THST-ORIG-CURR-AMT")
    private String origCurrAmt;

    @Column(name = "THST-ORG-NBR")
    private String orgNbr;

    @Column(name = "THST-ONUS-CURR-CONV")
    private String onusCurrConv;

    @Column(name = "THST-MERCH-STATE")
    private String merchState;

    @Column(name = "THST-MERCH-CAT")
    private String merchCat;

    @Column(name = "THST-MARKUP-AMT")
    private String markupAmt;

    @Column(name = "THST-INTL-FEE-IND")
    private String intlFeeInd;

    @Column(name = "THST-INTERCHG-REF-NBR")
    private String interchgRefNbr;

    @Column(name = "THST-DESCRIPTION")
    private String description;

    @Column(name = "THST-DCC-FLAG")
    private String dccFlag;

    @Column(name = "THST-CURR-NAME")
    private String currName;

    @Column(name = "THST-CCA-AMT")
    private String ccaAmt;

    @Column(name = "THST-CARD-NBR")
    private String cardNbr;

    @Column(name = "BCCTHST-RECORD")
    private String record;

    public String getApprCode() {
        return apprCode;
    }

    public void setApprCode(String apprCode) {
        this.apprCode = apprCode;
    }

    public String getSeqNbr() {
        return seqNbr;
    }

    public void setSeqNbr(String seqNbr) {
        this.seqNbr = seqNbr;
    }

    public String getXborderFee() {
        return xborderFee;
    }

    public void setXborderFee(String xborderFee) {
        this.xborderFee = xborderFee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }

    public String getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(String tranAmt) {
        this.tranAmt = tranAmt;
    }

    public String getStmtNbr() {
        return stmtNbr;
    }

    public void setStmtNbr(String stmtNbr) {
        this.stmtNbr = stmtNbr;
    }

    public String getStmtDate() {
        return stmtDate;
    }

    public void setStmtDate(String stmtDate) {
        this.stmtDate = stmtDate;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getReimbAtt() {
        return reimbAtt;
    }

    public void setReimbAtt(String reimbAtt) {
        this.reimbAtt = reimbAtt;
    }

    public String getRefSeq() {
        return refSeq;
    }

    public void setRefSeq(String refSeq) {
        this.refSeq = refSeq;
    }

    public String getRefNbrR() {
        return refNbrR;
    }

    public void setRefNbrR(String refNbrR) {
        this.refNbrR = refNbrR;
    }

    public String getRefNbr() {
        return refNbr;
    }

    public void setRefNbr(String refNbr) {
        this.refNbr = refNbr;
    }

    public String getRefDte() {
        return refDte;
    }

    public void setRefDte(String refDte) {
        this.refDte = refDte;
    }

    public String getRefBatch() {
        return refBatch;
    }

    public void setRefBatch(String refBatch) {
        this.refBatch = refBatch;
    }

    public String getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(String postingDate) {
        this.postingDate = postingDate;
    }

    public String getPostingAcctNbr() {
        return postingAcctNbr;
    }

    public void setPostingAcctNbr(String postingAcctNbr) {
        this.postingAcctNbr = postingAcctNbr;
    }

    public String getPosMode() {
        return posMode;
    }

    public void setPosMode(String posMode) {
        this.posMode = posMode;
    }

    public String getOrigCurrDec() {
        return origCurrDec;
    }

    public void setOrigCurrDec(String origCurrDec) {
        this.origCurrDec = origCurrDec;
    }

    public String getOrigCurrCode() {
        return origCurrCode;
    }

    public void setOrigCurrCode(String origCurrCode) {
        this.origCurrCode = origCurrCode;
    }

    public String getOrigCurrAmtD() {
        return origCurrAmtD;
    }

    public void setOrigCurrAmtD(String origCurrAmtD) {
        this.origCurrAmtD = origCurrAmtD;
    }

    public String getOrigCurrAmt() {
        return origCurrAmt;
    }

    public void setOrigCurrAmt(String origCurrAmt) {
        this.origCurrAmt = origCurrAmt;
    }

    public String getOrgNbr() {
        return orgNbr;
    }

    public void setOrgNbr(String orgNbr) {
        this.orgNbr = orgNbr;
    }

    public String getOnusCurrConv() {
        return onusCurrConv;
    }

    public void setOnusCurrConv(String onusCurrConv) {
        this.onusCurrConv = onusCurrConv;
    }

    public String getMerchState() {
        return merchState;
    }

    public void setMerchState(String merchState) {
        this.merchState = merchState;
    }

    public String getMerchCat() {
        return merchCat;
    }

    public void setMerchCat(String merchCat) {
        this.merchCat = merchCat;
    }

    public String getMarkupAmt() {
        return markupAmt;
    }

    public void setMarkupAmt(String markupAmt) {
        this.markupAmt = markupAmt;
    }

    public String getIntlFeeInd() {
        return intlFeeInd;
    }

    public void setIntlFeeInd(String intlFeeInd) {
        this.intlFeeInd = intlFeeInd;
    }

    public String getInterchgRefNbr() {
        return interchgRefNbr;
    }

    public void setInterchgRefNbr(String interchgRefNbr) {
        this.interchgRefNbr = interchgRefNbr;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDccFlag() {
        return dccFlag;
    }

    public void setDccFlag(String dccFlag) {
        this.dccFlag = dccFlag;
    }

    public String getCurrName() {
        return currName;
    }

    public void setCurrName(String currName) {
        this.currName = currName;
    }

    public String getCcaAmt() {
        return ccaAmt;
    }

    public void setCcaAmt(String ccaAmt) {
        this.ccaAmt = ccaAmt;
    }

    public String getCardNbr() {
        return cardNbr;
    }

    public void setCardNbr(String cardNbr) {
        this.cardNbr = cardNbr;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }
}
