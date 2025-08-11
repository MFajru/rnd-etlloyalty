package rnd.etlloyalty.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "crdlnk_oadclog")
public class OadclogRecord {
    @Id
    @Column(name = "TABLE_ID")
    private Long tableId;

    @Column(name = "OADCL_T_CARD_ORG")
    private String cardOrg;

    @Column(name = "OADCL_CARDHOLDER_NBR")
    private String cardholderNbr;

    @Column(name = "OADCL_T_CARD_TYPE")
    private String cardType;

    @Column(name = "OADCL_T_CARD_NBR")
    private String cardNbr;

    @Column(name = "OADCL_APPROVAL_CODE")
    private String approvalCode;

    @Column(name = "OADCL_TXN_DATE")
    private String txnDate;

    @Column(name = "OADCL_TXN_TIME")
    private String txnTime;

    @Column(name = "OADCL_B022_POS_EM_PAN")
    private String posEmPan;

    @Column(name = "OADCL_B022_POS_EM_PIN_CAP")
    private String posEmPinCap;

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public String getCardOrg() {
        return cardOrg;
    }

    public void setCardOrg(String cardOrg) {
        this.cardOrg = cardOrg;
    }

    public String getCardholderNbr() {
        return cardholderNbr;
    }

    public void setCardholderNbr(String cardholderNbr) {
        this.cardholderNbr = cardholderNbr;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNbr() {
        return cardNbr;
    }

    public void setCardNbr(String cardNbr) {
        this.cardNbr = cardNbr;
    }

    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(String txnDate) {
        this.txnDate = txnDate;
    }

    public String getTxnTime() {
        return txnTime;
    }

    public void setTxnTime(String txnTime) {
        this.txnTime = txnTime;
    }

    public String getPosEmPan() {
        return posEmPan;
    }

    public void setPosEmPan(String posEmPan) {
        this.posEmPan = posEmPan;
    }

    public String getPosEmPinCap() {
        return posEmPinCap;
    }

    public void setPosEmPinCap(String posEmPinCap) {
        this.posEmPinCap = posEmPinCap;
    }
}
