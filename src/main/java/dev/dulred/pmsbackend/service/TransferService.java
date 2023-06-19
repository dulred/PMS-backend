package dev.dulred.pmsbackend.service;

import dev.dulred.pmsbackend.entity.Transfer;

import java.util.Map;

public interface TransferService {
    Transfer getBeforePost (int id);
    String addTransferStaff (Transfer transfer);
    Map<String,Object> getTransferByPage (Transfer transfer);
    Map<String,Object> selectTransfersByCon (Transfer transfer);
}
