package dev.dulred.pmsbackend.repository;

import dev.dulred.pmsbackend.entity.Transfer;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository {
    Transfer getBeforePost (int id);
}
