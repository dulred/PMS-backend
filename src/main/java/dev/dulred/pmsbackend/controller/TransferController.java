package dev.dulred.pmsbackend.controller;

import dev.dulred.pmsbackend.entity.Transfer;
import dev.dulred.pmsbackend.service.TransferService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class TransferController {
    @Resource
    TransferService transferService;

    @GetMapping("/getBeforePost")
    Transfer getBeforePost (int id)
    {
        return  transferService.getBeforePost(id);
    }
    @PostMapping("/addTransferStaff")
    public  String addTransferStaff (@RequestBody Transfer transfer)
    {
        return transferService.addTransferStaff(transfer);
    }

    @PostMapping("/getTransferByPage")
    public Map<String,Object> getTransferByPage (@RequestBody Transfer transfer)
    {
        return transferService.getTransferByPage(transfer);
    }
    @PostMapping("/selectTransfersByCon")
    public Map<String,Object> selectTransfersByCon (@RequestBody Transfer transfer)
    {
        return transferService.selectTransfersByCon(transfer);
    }



}
