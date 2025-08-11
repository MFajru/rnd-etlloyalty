package rnd.etlloyalty.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "crdlnk_bnlog")
public class BnlogRecord {
    @Id
    @Column(name = "TABLE_ID")
    private Long tableId;

    @Column(name = "BNLOG_ACCT_NBR")
    private String acctNbr;

    @Column(name = "BNLOG_F038_AUTH_CDE")
    private String authCode;
    @Column(name = "BNICA_F060_BANK_HEADER")
    private String bankHeader;

    @Column(name = "BNICA_F060_BANK_HEADER_L")
    private String bankHeaderL;

    @Column(name = "BNICA_F060_TERM_FIID")
    private String termFiid;

    @Column(name = "BNICA_F060_TERM_LOGIC_NETWORK")
    private String termLogicNetwork;

    @Column(name = "BNICA_F060_TELLER_ID")
    private String tellerId;

    @Column(name = "BNICA_F060_ACQUIRER_FIID")
    private String acquirerFiid;

    @Column(name = "BNICA_F041_CRD_ACPT_TRM")
    private String cardAcceptorTerminal;
}
