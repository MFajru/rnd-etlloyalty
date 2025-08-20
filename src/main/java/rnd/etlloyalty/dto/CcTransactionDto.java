package rnd.etlloyalty.dto;

import java.math.BigDecimal;

public class CcTransactionDto {
    private String approvalCode;
    private String tranCode;
    private String tranCodeDesc;
    private String tranFeature;
    private String channel;
    private String utilCode;
    private String tranDate;
    private BigDecimal tranAmount;
    private String cardOrg;
    private String cardType;
    private String cardNumber;
    private String countryCode;
    private String terminalId;
    private String merchantOrg;
    private String merchantId;
    private String merchantCat;

    public CcTransactionDto(String approvalCode, String tranCode, String tranCodeDesc, String tranFeature, String channel, String utilCode, String tranDate, BigDecimal tranAmount, String cardOrg, String cardType, String cardNumber, String countryCode, String terminalId, String merchantOrg, String merchantId, String merchantCat) {
        this.approvalCode = approvalCode;
        this.tranCode = tranCode;
        this.tranCodeDesc = tranCodeDesc;
        this.tranFeature = tranFeature;
        this.channel = channel;
        this.utilCode = utilCode;
        this.tranDate = tranDate;
        this.tranAmount = tranAmount;
        this.cardOrg = cardOrg;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.countryCode = countryCode;
        this.terminalId = terminalId;
        this.merchantOrg = merchantOrg;
        this.merchantId = merchantId;
        this.merchantCat = merchantCat;
    }

    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
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

    public BigDecimal getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(BigDecimal tranAmount) {
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

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
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
