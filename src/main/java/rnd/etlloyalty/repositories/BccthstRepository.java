package rnd.etlloyalty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rnd.etlloyalty.entities.BccthstRecord;

@Repository
public interface BccthstRepository extends JpaRepository<BccthstRecord, String> {
}
