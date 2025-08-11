package rnd.etlloyalty.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "crdlnk_cpcrd")
//@Table(name = "RND_CRDLNK_CPCRD")
public class CpcrdRecord {
    @Id
    @Column(name = "CM_CARD_NMBR")
    private String cardNbr;

    @Column(name = "CM_ORG_NMBR")
    private String orgNbr;

    @Column(name = "CM_TYPE")
    private String type;

    @Column(name = "CM_SHORT_NAME")
    private String shortName;

    @Column(name = "CM_CUSTOMER_ORG")
    private String customerOrg;

    @Column(name = "CM_CUSTOMER_NMBR")
    private String customerNbr;

    @Column(name = "CM_CYCLE")
    private Integer cycle; // Integer is appropriate for a cycle number

    @Column(name = "CM_BLOCK_CODE")
    private String blockCode;

    @Column(name = "CM_STATUS")
    private String status;

    @Column(name = "CM_WAIVE_ANNUAL_FEE")
    private Boolean waiveAnnualFee;

    @Column(name = "CM_DTE_OPENED")
    private LocalDate dateOpened; // Using LocalDate for date fields

    @Column(name = "CM_DTE_CLOSED")
    private LocalDate dateClosed;

    @Column(name = "CM_CARD_FEE_DTE")
    private LocalDate cardFeeDate;

    @Column(name = "CM_CARD_EXPIR_DTE")
    private LocalDate cardExpirationDate;

    @Column(name = "CM_EMBOSSER_NAME_1")
    private String embosserName1;

    @Column(name = "CM_EMBOSSER_NAME_4")
    private String embosserName4;

    @Column(name = "CM_POSTING_FLAG")
    private Boolean postingFlag; // Also a good candidate for Boolean

    @Column(name = "CM_POSTING_ACCT_ORGN")
    private String postingAcctOrgn;

    @Column(name = "CM_POSTING_ACCT_TYPE")
    private String postingAcctType;

    @Column(name = "CM_POSTING_ACCT_NMBR")
    private String postingAcctNbr;

    public String getCardNbr() {
        return cardNbr;
    }

    public void setCardNbr(String cardNbr) {
        this.cardNbr = cardNbr;
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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getCustomerOrg() {
        return customerOrg;
    }

    public void setCustomerOrg(String customerOrg) {
        this.customerOrg = customerOrg;
    }

    public String getCustomerNbr() {
        return customerNbr;
    }

    public void setCustomerNbr(String customerNbr) {
        this.customerNbr = customerNbr;
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public String getBlockCode() {
        return blockCode;
    }

    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getWaiveAnnualFee() {
        return waiveAnnualFee;
    }

    public void setWaiveAnnualFee(Boolean waiveAnnualFee) {
        this.waiveAnnualFee = waiveAnnualFee;
    }

    public LocalDate getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(LocalDate dateOpened) {
        this.dateOpened = dateOpened;
    }

    public LocalDate getDateClosed() {
        return dateClosed;
    }

    public void setDateClosed(LocalDate dateClosed) {
        this.dateClosed = dateClosed;
    }

    public LocalDate getCardFeeDate() {
        return cardFeeDate;
    }

    public void setCardFeeDate(LocalDate cardFeeDate) {
        this.cardFeeDate = cardFeeDate;
    }

    public LocalDate getCardExpirationDate() {
        return cardExpirationDate;
    }

    public void setCardExpirationDate(LocalDate cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    public String getEmbosserName1() {
        return embosserName1;
    }

    public void setEmbosserName1(String embosserName1) {
        this.embosserName1 = embosserName1;
    }

    public String getEmbosserName4() {
        return embosserName4;
    }

    public void setEmbosserName4(String embosserName4) {
        this.embosserName4 = embosserName4;
    }

    public Boolean getPostingFlag() {
        return postingFlag;
    }

    public void setPostingFlag(Boolean postingFlag) {
        this.postingFlag = postingFlag;
    }

    public String getPostingAcctOrgn() {
        return postingAcctOrgn;
    }

    public void setPostingAcctOrgn(String postingAcctOrgn) {
        this.postingAcctOrgn = postingAcctOrgn;
    }

    public String getPostingAcctType() {
        return postingAcctType;
    }

    public void setPostingAcctType(String postingAcctType) {
        this.postingAcctType = postingAcctType;
    }

    public String getPostingAcctNbr() {
        return postingAcctNbr;
    }

    public void setPostingAcctNbr(String postingAcctNbr) {
        this.postingAcctNbr = postingAcctNbr;
    }
}
