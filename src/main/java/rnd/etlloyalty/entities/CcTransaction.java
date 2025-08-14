package rnd.etlloyalty.entities;

import jakarta.persistence.*;

@Entity
//@Table(name = "cc_transaction")
@Table(name = "RND_CC_TRX")
public class CcTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tableId;

    private String approvalCode;
    private String tranCode;
    private String tranCodeDesc;
    private String tranFeature;
    private String channel;
    private String utilCode;
    private String tranDate;
    private String tranAmount;
    private String cardOrg;
    private String cardType;
    private String cardNumber;
    private String countryCode;
    private String terminalCode;
    private String merchantOrg;
    private String merchantId;
    private String merchantCat;

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approval_code) {
        this.approvalCode = approval_code;
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }

    public String getTranCodeDesc() {
        return tranCodeDesc;
    }

    public void setTranCodeDesc(String tranCodeDesc) {
        this.tranCodeDesc = tranCodeDesc;
    }

    public String getTranFeature() {
        return tranFeature;
    }

    public void setTranFeature(String tranFeature) {
        this.tranFeature = tranFeature;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUtilCode() {
        return utilCode;
    }

    public void setUtilCode(String utilCode) {
        this.utilCode = utilCode;
    }

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }

    public String getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(String tranAmount) {
        this.tranAmount = tranAmount;
    }

    public String getCardOrg() {
        return cardOrg;
    }

    public void setCardOrg(String cardOrg) {
        this.cardOrg = cardOrg;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getTerminalCode() {
        return terminalCode;
    }

    public void setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
    }

    public String getMerchantOrg() {
        return merchantOrg;
    }

    public void setMerchantOrg(String merchantOrg) {
        this.merchantOrg = merchantOrg;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantCat() {
        return merchantCat;
    }

    public void setMerchantCat(String merchantCat) {
        this.merchantCat = merchantCat;
    }
}
