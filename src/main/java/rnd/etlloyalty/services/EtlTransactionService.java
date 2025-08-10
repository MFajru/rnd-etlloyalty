package rnd.etlloyalty.services;

import org.springframework.stereotype.Service;
import rnd.etlloyalty.entities.BccthstRecord;
import rnd.etlloyalty.interfaces.IEtlTransaction;
import rnd.etlloyalty.repositories.BccthstRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EtlTransactionService implements IEtlTransaction {

    private  final BccthstRepository bccthstRepository;

    public EtlTransactionService(BccthstRepository bccthstRepository) {
        this.bccthstRepository = bccthstRepository;
    }


    @Override
    public List<BccthstRecord> getBccthstRecords() {
        // dapet list record yang baru masuk
        // mapping ke model cc transaction
        // insert ke db
        // tinggal mikir gimana caranya function ini selalu jalan pas ada data baru masuk
        List<BccthstRecord> records = bccthstRepository.findAll();
        for (BccthstRecord record: records) {
//            record
        }
        return bccthstRepository.findAll();
    }

    @Override
    public BccthstRecord getBccthstRecord(String approvalCode) {
        Optional<BccthstRecord> res = bccthstRepository.findById(approvalCode);
        return res.orElse(null);

    }
}
