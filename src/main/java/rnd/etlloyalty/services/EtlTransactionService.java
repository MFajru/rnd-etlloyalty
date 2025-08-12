package rnd.etlloyalty.services;

import org.springframework.stereotype.Service;
import rnd.etlloyalty.entities.BccthstRecord;
import rnd.etlloyalty.entities.CcTransaction;
import rnd.etlloyalty.interfaces.IEtlTransaction;
import rnd.etlloyalty.repositories.BccthstRepository;
import rnd.etlloyalty.repositories.OaslogRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EtlTransactionService implements IEtlTransaction {

    private  final BccthstRepository bccthstRepository;
    private final OaslogRepository oaslogRepository;

    public EtlTransactionService(BccthstRepository bccthstRepository, OaslogRepository oaslogRepository) {
        this.bccthstRepository = bccthstRepository;
        this.oaslogRepository = oaslogRepository;
    }


    @Override
    public List<BccthstRecord> getBccthstRecords() {
        // dapet list record yang baru masuk
        // mapping ke model cc transaction
        // insert ke db
        // tinggal mikir gimana caranya function ini selalu jalan pas ada data baru masuk
        List<BccthstRecord> records = bccthstRepository.selectAllBccthst();
        for (BccthstRecord record: records) {
            CcTransaction ccTransaction = new CcTransaction();
            ccTransaction.setApprovalCode(record.getApprovalCode());
            ccTransaction.setCardNumber(record.getCardNbr());
            ccTransaction.setCardOrg(record.getOrgNbr());
            ccTransaction.setCardType(record.getType());
            ccTransaction.setMerchantCat(record.getMerchCat());
            ccTransaction.setMerchantId(null); // join dengan oaslog, get merchant id
            ccTransaction.setMerchantOrg(null); // join dengan oaslog, get merchant id
            ccTransaction.setChannel(null); //liat notes untuk dapetin channel
            ccTransaction.setTerminalCode(null); // join oaslog
            ccTransaction.setTranAmount(ccTransaction.getTranAmount());
            ccTransaction.setTranCode(record.getTranCode());
            ccTransaction.setTranCodeDesc(null); // custom sendiri, liat di excel
            ccTransaction.setTranFeature(null); // liat notes untuk buat sendiri
            ccTransaction.setTranDate(record.getTranDate());
            ccTransaction.setUtilCode(null); // liat BNLOG dan note untuk tau cara ambilnya
            ccTransaction.setCountryCode(null); // join dengan oaslog
        }
        return bccthstRepository.findAll();
    }

    @Override
    public BccthstRecord getBccthstRecord(String approvalCode) {
        Optional<BccthstRecord> res = bccthstRepository.findById(approvalCode);
        return res.orElse(null);

    }
}
