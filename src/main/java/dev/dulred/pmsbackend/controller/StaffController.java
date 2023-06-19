package dev.dulred.pmsbackend.controller;

import dev.dulred.pmsbackend.entity.*;
import dev.dulred.pmsbackend.service.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class StaffController {
    @Resource
    StaffService staffService;

    @PostMapping("/addStaff")
    public String addStaff (@RequestBody Staff staff){
        return staffService.addStaff(staff);
    }

    @PostMapping("/getStaff")
    public Map<String, Object> getStaff (@RequestBody StaffByCon staffByCon)
    {
        return staffService.getStaff(staffByCon);
    }

    @PostMapping("/selectStaffByCon")
    public Map<String, Object> selectStaffByCon (@RequestBody StaffByCon staffByCon)
    {
        return staffService.selectStaffByCon(staffByCon);
    }

    @GetMapping("/getStaffDetail")
    public Staff getStaffDetail (int id){
        return staffService.getStaffDetail(id);
    }

    @PostMapping("/updateStaff")
    public String updateStaff ( @RequestBody Staff staff){
        return staffService.updateStaff(staff);
    }
    @PostMapping("/selectPeriodStaff")
    public  Map<String, Object> selectPeriodStaff (@RequestBody StaffByCon staffByCon)
    {
        return staffService.selectPeriodStaff(staffByCon);
    }
    @PostMapping("/selectPeriodStaffCon")
    public Map<String,Object> selectPeriodStaffCon (@RequestBody PeriodByCon periodByCon)
    {
        return staffService.selectPeriodStaffCon(periodByCon);
    }
    @GetMapping ("/periodOp")
    public String periodOp (int id ,String status){
        return staffService.periodOp(id,status);
    }



}
