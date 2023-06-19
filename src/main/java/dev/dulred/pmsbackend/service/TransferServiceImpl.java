package dev.dulred.pmsbackend.service;

import dev.dulred.pmsbackend.entity.Transfer;
import dev.dulred.pmsbackend.repository.TransferRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TransferServiceImpl implements  TransferService{
    @Resource
    TransferRepository transferRepository;
    @Override
    public Transfer getBeforePost(int id) {
        return transferRepository.getBeforePost(id);
    }

    @Override
    public String addTransferStaff(Transfer transfer) {
        if (transferRepository.addTransferStaff(transfer)>0 && transferRepository.updateStaff(transfer)>0){
            return "ok";
        }else {
            return "no";
        }
    }

    @Override
    public Map<String, Object> getTransferByPage(Transfer transfer) {
        Map<String,Object> map = new HashMap<>();
        transfer.setAct("byPage");
        List<Transfer> transfers  = transferRepository.getTransferByPage(transfer);
        map.put("transfers",transfers);
        map.put("total",transferRepository.getTransferByPage(null).size());
        return map;
    }

    @Override
    public Map<String, Object> selectTransfersByCon(Transfer transfer) {
        Map<String,Object> map = new HashMap<>();
        transfer.setAct("byPage");
        List<Transfer> transfers  = transferRepository.selectTransfersByCon(transfer);
        map.put("transfers",transfers);
        transfer.setAct("byNoPage");
        map.put("total",transferRepository.selectTransfersByCon(transfer).size());
        return map;
    }
}
