package rnd.etlloyalty.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "crdlnk_mismer")
//@Table(name = "RND_CRDLNK_MISMER")

public class MismerRecord {
    @Id
    @Column(name = "MERCHANT_ID")
    private String merchantId;

    @Column(name = "MERCHANT_ORG")
    private String merchantOrg;

    @Column(name = "MERCH_CAT_VISA")
    private String merchCatVisa;

    @Column(name = "MERCH_CAT_MC")
    private String merchCatMc;

    @Column(name = "MERCH_CAT_JCB")
    private String merchCatJcb;

    @Column(name = "MERCH_CAT_PL")
    private String merchCatPl;

    @Column(name = "MERCH_CAT_DESC")
    private String merchCatDesc;

    @Column(name = "MERCHANT_NAME")
    private String merchantName;

    @Column(name = "MERCHANT_STATUS")
    private String merchantStatus;

    @Column(name = "MERCHANT_STATUS_DESC")
    private String merchantStatusDesc;

    @Column(name = "MERCHANT_CITY")
    private String merchantCity;

    @Column(name = "MERCHANT_ADDRESS")
    private String merchantAddress;

    @Column(name = "MERCHANT_CP_NAME")
    private String contactPersonName;

    @Column(name = "MERCHANT_CP_PHONE")
    private String contactPersonPhone;

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantOrg() {
        return merchantOrg;
    }

    public void setMerchantOrg(String merchantOrg) {
        this.merchantOrg = merchantOrg;
    }

    public String getMerchCatVisa() {
        return merchCatVisa;
    }

    public void setMerchCatVisa(String merchCatVisa) {
        this.merchCatVisa = merchCatVisa;
    }

    public String getMerchCatMc() {
        return merchCatMc;
    }

    public void setMerchCatMc(String merchCatMc) {
        this.merchCatMc = merchCatMc;
    }

    public String getMerchCatJcb() {
        return merchCatJcb;
    }

    public void setMerchCatJcb(String merchCatJcb) {
        this.merchCatJcb = merchCatJcb;
    }

    public String getMerchCatPl() {
        return merchCatPl;
    }

    public void setMerchCatPl(String merchCatPl) {
        this.merchCatPl = merchCatPl;
    }

    public String getMerchCatDesc() {
        return merchCatDesc;
    }

    public void setMerchCatDesc(String merchCatDesc) {
        this.merchCatDesc = merchCatDesc;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(String merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public String getMerchantStatusDesc() {
        return merchantStatusDesc;
    }

    public void setMerchantStatusDesc(String merchantStatusDesc) {
        this.merchantStatusDesc = merchantStatusDesc;
    }

    public String getMerchantCity() {
        return merchantCity;
    }

    public void setMerchantCity(String merchantCity) {
        this.merchantCity = merchantCity;
    }

    public String getMerchantAddress() {
        return merchantAddress;
    }

    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getContactPersonPhone() {
        return contactPersonPhone;
    }

    public void setContactPersonPhone(String contactPersonPhone) {
        this.contactPersonPhone = contactPersonPhone;
    }
}
