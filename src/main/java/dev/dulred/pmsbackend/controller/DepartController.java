package dev.dulred.pmsbackend.controller;


import dev.dulred.pmsbackend.entity.Depart;
import dev.dulred.pmsbackend.service.DepartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

@RestController
public class DepartController {

    @Resource
    DepartService departService;
    @GetMapping("/getDepartment")
    public List<Depart> selectDepart (){return departService.selectDepart();}

    @GetMapping("/test")
    public int test(){
        return 666;
    }

}
