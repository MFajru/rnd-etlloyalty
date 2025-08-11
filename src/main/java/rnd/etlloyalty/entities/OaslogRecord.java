package rnd.etlloyalty.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "crdlnk_oaslog")
//@Table(name = "RND_ODS_CRDLNK_OASLOG")
public class OaslogRecord {
    @Id
    @Column(name = "TABLE_ID")
    private Long tableId;

    @Column(name = "OASA_ORG")
    private String org;

    @Column(name = "OASA_ACCT")
    private String acct;

    @Column(name = "OASA_B038_AUTH_CODE")
    private String authCode;

    @Column(name = "OASA_B004_TXN_AMT")
    private String transactionAmount;

    @Column(name = "OASA_TYPE")
    private String type;

    @Column(name = "OASA_MERCHANT_ORG")
    private String merchantOrg;

    @Column(name = "OASA_MERCHANT_NBR")
    private String merchantNbr;

    @Column(name = "OASA_B018_MERCH_TYPE")
    private String merchantType;

    @Column(name = "OASA_B022_POS_ENTRY_MODE")
    private String posEntryMode;

    @Column(name = "OASA_B019_CNTRY_CODE")
    private String countryCode;

    @Column(name = "OASA_VISA_B090_ORIG_MTI")
    private String visaOrigMti;

    @Column(name = "OASA_MSTR_B090_ORG_MTI")
    private String mastercardOrigMti;

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getAcct() {
        return acct;
    }

    public void setAcct(String acct) {
        this.acct = acct;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMerchantOrg() {
        return merchantOrg;
    }

    public void setMerchantOrg(String merchantOrg) {
        this.merchantOrg = merchantOrg;
    }

    public String getMerchantNbr() {
        return merchantNbr;
    }

    public void setMerchantNbr(String merchantNbr) {
        this.merchantNbr = merchantNbr;
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
    }

    public String getPosEntryMode() {
        return posEntryMode;
    }

    public void setPosEntryMode(String posEntryMode) {
        this.posEntryMode = posEntryMode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getVisaOrigMti() {
        return visaOrigMti;
    }

    public void setVisaOrigMti(String visaOrigMti) {
        this.visaOrigMti = visaOrigMti;
    }

    public String getMastercardOrigMti() {
        return mastercardOrigMti;
    }

    public void setMastercardOrigMti(String mastercardOrigMti) {
        this.mastercardOrigMti = mastercardOrigMti;
    }
}
