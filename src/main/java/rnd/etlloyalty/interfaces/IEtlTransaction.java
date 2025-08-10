package rnd.etlloyalty.interfaces;

import rnd.etlloyalty.entities.BccthstRecord;
import rnd.etlloyalty.repositories.BccthstRepository;

import java.util.List;

public interface IEtlTransaction {
    List<BccthstRecord> getBccthstRecords();
    BccthstRecord getBccthstRecord(String approvalCode);
}
