package dev.dulred.pmsbackend.controller;

import dev.dulred.pmsbackend.entity.Transfer;
import dev.dulred.pmsbackend.service.TransferService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TransferController {
    @Resource
    TransferService transferService;

    @GetMapping("/getBeforePost")
    Transfer getBeforePost (int id)
    {
        return  transferService.getBeforePost(id);
    }
}
