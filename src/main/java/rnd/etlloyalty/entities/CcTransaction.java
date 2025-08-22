package rnd.etlloyalty.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
//@Table(name = "cc_transaction")
@Table(name = "RND_CC_TRX")
public class CcTransaction {
    @Id
    private String tableId;

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
    @Column(insertable = false, updatable = false)
    private LocalDateTime createdAt;
    @Column(insertable = false, updatable = false)
    private LocalDateTime updatedAt;


    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
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

    public void setTerminalId(String terminalCode) {
        this.terminalId = terminalCode;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    //    @Override
//    public boolean equals(Object o) {
//        // 1. Check if they are the exact same object in memory
//        if (this == o) return true;
//        // 2. Check if the other object is null or a different class
//        if (o == null || getClass() != o.getClass()) return false;
//        // 3. Cast the object to your class type
//        CcTransaction that = (CcTransaction) o;
//        // 4. The rule for equality: they are equal if their approval codes are the same.
//        // We also check that approvalCode is not null to avoid errors.
//        return approvalCode != null && approvalCode.equals(that.approvalCode);
//    }
//
//    @Override
//    public int hashCode() {
//        // The hash code must be based on the same field(s) used in equals().
//        return Objects.hash(approvalCode);
//    }
}
