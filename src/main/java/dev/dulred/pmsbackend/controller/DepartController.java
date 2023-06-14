package dev.dulred.pmsbackend.controller;


import dev.dulred.pmsbackend.entity.Depart;
import dev.dulred.pmsbackend.entity.DepartByCon;
import dev.dulred.pmsbackend.service.DepartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

@RestController
public class DepartController {

    @Resource
    DepartService departService;
    @GetMapping("/getDepartment")
    public List<Depart> selectDepart (){return departService.selectDepart();}

    @PostMapping("/addDepartment")
    public String addDepartment(@RequestBody Depart depart ){
        return departService.addDepartment(depart);
    }

    @PostMapping("/getDepartmentByPage")
    public  Map<String, Object> getDepartmentByPage (@RequestBody DepartByCon departByCon){
        return departService.getDepartmentByPage(departByCon);
    }

    @PostMapping("/selectDepartmentsByCon")
    public Map<String,Object> selectDepartmentsByCon (@RequestBody DepartByCon departByCon){
        return  departService.selectDepartmentsByCon(departByCon);
    }

    @PostMapping("/deleteDepartment")
    public  String deleteDepartment(int id){
        return departService.deleteDepartment(id);
    }

    @PostMapping("/getDepartmentDetail")
    public Map<String,Object> getDepartmentDetail (int id){
        return departService.getDepartmentDetail(id);
    }

    @PostMapping("/updateDepartment")
    public String updateDepartment ( @RequestBody Depart depart){
        System.out.println(depart.toString());
        return  departService.updateDepartment(depart);
    }

}
