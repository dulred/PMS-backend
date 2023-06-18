package dev.dulred.pmsbackend.service;

import dev.dulred.pmsbackend.entity.Transfer;

public interface TransferService {
    Transfer getBeforePost (int id);
}
