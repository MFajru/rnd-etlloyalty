package rnd.etlloyalty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rnd.etlloyalty.entities.CcTransaction;

import java.util.List;

public interface CcTransactionRepository extends JpaRepository<CcTransaction, String> {

}
