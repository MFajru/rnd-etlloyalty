package rnd.etlloyalty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rnd.etlloyalty.entities.CcTransaction;

public interface CcTransactionRepository extends JpaRepository<CcTransaction, Long> {
}
