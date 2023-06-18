package dev.dulred.pmsbackend.service;

import dev.dulred.pmsbackend.entity.Transfer;
import dev.dulred.pmsbackend.repository.TransferRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TransferServiceImpl implements  TransferService{
    @Resource
    TransferRepository transferRepository;
    @Override
    public Transfer getBeforePost(int id) {
        return transferRepository.getBeforePost(id);
    }
}
