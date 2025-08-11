package rnd.etlloyalty.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "crdlnk_cardprod")
//@Table(name = "RND_CRDLNK_CARDPROD")
public class CardProd {
    @Id
    private Long id;

    @Column(name = "PM_ORG_NMBR")
    private String orgNbr;
    @Column(name = "PM_TYPE_NMBR")
    private String typeNbr;
    @Column(name = "PM_TYPE_DESC")
    private String typeDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgNbr() {
        return orgNbr;
    }

    public void setOrgNbr(String orgNbr) {
        this.orgNbr = orgNbr;
    }

    public String getTypeNbr() {
        return typeNbr;
    }

    public void setTypeNbr(String typeNbr) {
        this.typeNbr = typeNbr;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }
}
