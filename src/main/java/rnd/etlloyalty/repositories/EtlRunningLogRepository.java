package rnd.etlloyalty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rnd.etlloyalty.entities.EtlRunningLog;

import java.time.LocalDateTime;

@Repository
public interface EtlRunningLogRepository extends JpaRepository<EtlRunningLog, String> {
    @Query(value = "SELECT SYSDATE FROM DUAL", nativeQuery = true)
    LocalDateTime getDbDateTime();
}
