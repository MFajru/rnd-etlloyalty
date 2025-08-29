package rnd.etlloyalty.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "RND_ETL_RUNNING_LOG")
public class EtlRunningLog {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "ETL_DATA_AMT")
    private Integer etlDataAmt;
    @Column(name = "ETL_START_TIMESTAMP")
    private LocalDateTime etlStartTimestamp;
    @Column(name = "ETL_FINISH_TIMESTAMP")
    private LocalDateTime etlFinishTimestamp;
    @Column(name = "ETL_SUCCESS_AMT")
    private Integer etlSuccessAmt;
    @Column(name = "ETL_FAILED_AMT")
    private Integer etlFailedAmt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getEtlDataAmt() {
        return etlDataAmt;
    }

    public void setEtlDataAmt(Integer etlDataAmt) {
        this.etlDataAmt = etlDataAmt;
    }

    public Integer getEtlSuccessAmt() {
        return etlSuccessAmt;
    }

    public void setEtlSuccessAmt(Integer etlSuccessAmt) {
        this.etlSuccessAmt = etlSuccessAmt;
    }

    public Integer getEtlFailedAmt() {
        return etlFailedAmt;
    }

    public void setEtlFailedAmt(Integer etlFailedAmt) {
        this.etlFailedAmt = etlFailedAmt;
    }

    public LocalDateTime getEtlStartTimestamp() {
        return etlStartTimestamp;
    }

    public void setEtlStartTimestamp(LocalDateTime etlStartTimestamp) {
        this.etlStartTimestamp = etlStartTimestamp;
    }

    public LocalDateTime getEtlFinishTimestamp() {
        return etlFinishTimestamp;
    }

    public void setEtlFinishTimestamp(LocalDateTime elFinishTimeStamp) {
        this.etlFinishTimestamp = elFinishTimeStamp;
    }
}
