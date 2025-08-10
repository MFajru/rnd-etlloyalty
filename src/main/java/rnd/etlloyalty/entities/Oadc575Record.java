package rnd.etlloyalty.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "crdlnk_oadc575")
public class Oadc575Record {
    @Id
    @Column(name = "TERMINAL_ID")
    private String terminalId;

    @Column(name = "MERCHANT_ORG")
    private String merchantOrg;

    @Column(name = "MERCHANT_NBR")
    private String merchantNbr;

    @Column(name = "MERCHANT_CAT")
    private String merchantCat;

    @Column(name = "MERCHANT_NAME")
    private String merchantName;

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

    public String getMerchantNbr() {
        return merchantNbr;
    }

    public void setMerchantNbr(String merchantNbr) {
        this.merchantNbr = merchantNbr;
    }

    public String getMerchantCat() {
        return merchantCat;
    }

    public void setMerchantCat(String merchantCat) {
        this.merchantCat = merchantCat;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }
}
