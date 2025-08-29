package rnd.etlloyalty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rnd.etlloyalty.entities.OaslogRecord;

import java.util.List;

@Repository
public interface OaslogRepository extends JpaRepository<OaslogRecord, Long> {
    @Query(value = "SELECT r.* FROM EPURSEPLUS.RND_ODS_CRDLNK_OASLOG r", nativeQuery = true)
    List<OaslogRecord> selectAllOaslog();
}
