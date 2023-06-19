package dev.dulred.pmsbackend.repository;

import dev.dulred.pmsbackend.entity.Transfer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransferRepository {
    Transfer getBeforePost (int id);
    int addTransferStaff (Transfer transfer);
    int updateStaff(Transfer transfer);
    List<Transfer> getTransferByPage (Transfer transfer);
    List<Transfer> selectTransfersByCon (Transfer transfer);

}
