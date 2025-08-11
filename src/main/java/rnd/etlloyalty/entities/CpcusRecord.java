package rnd.etlloyalty.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "crdlnk_cpcus")
//@Table(name = "RND_CRDLNK_CPCUS")

public class CpcusRecord {
    @Id
    @Column(name = "CR_ACCT_NBR")
    private String acctNbr;

    @Column(name = "CR_ORG_NBR")
    private String orgNbr;

    @Column(name = "CR_SHORT_NAME")
    private String shortName;

    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    @Column(name = "NIK")
    private String nik;

    @Column(name = "CR_DTE_BIRTH")
    private LocalDate dateOfBirth;

    @Column(name = "CR_HOME_PHONE")
    private String homePhone;

    @Column(name = "CR_OFFICE_PHONE")
    private String officePhone;

    @Column(name = "CR_EMPLOYER")
    private String employer;

    @Column(name = "CR_CO_EMPLOYER")
    private String coEmployer;

    @Column(name = "CR_BILLING_CYCLE")
    private Integer billingCycle;

    @Column(name = "CR_MBR_SINCE")
    private LocalDate memberSince;

    @Column(name = "CR_EU_SURN")
    private String euSurname;

    @Column(name = "CR_EU_SEX")
    private String sex;

    @Column(name = "FULL_ADDRESS")
    private String fullAddress;

    @Column(name = "ZIP_CODE")
    private String zipCode;

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getOrgNbr() {
        return orgNbr;
    }

    public void setOrgNbr(String orgNbr) {
        this.orgNbr = orgNbr;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getCoEmployer() {
        return coEmployer;
    }

    public void setCoEmployer(String coEmployer) {
        this.coEmployer = coEmployer;
    }

    public Integer getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(Integer billingCycle) {
        this.billingCycle = billingCycle;
    }

    public LocalDate getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(LocalDate memberSince) {
        this.memberSince = memberSince;
    }

    public String getEuSurname() {
        return euSurname;
    }

    public void setEuSurname(String euSurname) {
        this.euSurname = euSurname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
