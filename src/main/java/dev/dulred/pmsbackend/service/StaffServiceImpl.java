package dev.dulred.pmsbackend.service;

import dev.dulred.pmsbackend.entity.PeriodByCon;
import dev.dulred.pmsbackend.entity.Staff;
import dev.dulred.pmsbackend.entity.StaffByCon;
import dev.dulred.pmsbackend.repository.StaffRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StaffServiceImpl implements  StaffService{

    @Resource
    StaffRepository staffRepository;
    @Override
    public String addStaff(Staff staff) {
       if (staffRepository.addStaff(staff)>0){
           return "ok";
       }else {
           return "no";
       }
    }

    @Override
    public Map<String, Object> getStaff(StaffByCon staffByCon) {
        Map<String,Object> map = new HashMap<>();
        staffByCon.setAct("byPage");
        List<Staff> staffs = staffRepository.getStaff(staffByCon);
        map.put("staffs",staffs);
        map.put("total",staffRepository.getStaff(null).size());
        return  map;
    }
    public Map<String, Object> selectStaffByCon(StaffByCon staffByCon) {
        Map<String,Object> map = new HashMap<>();
        staffByCon.setAct("byPage");
        List<Staff> staffs = staffRepository.selectStaffByCon(staffByCon);
        map.put("staffs",staffs);
        staffByCon.setAct("byNoPage");
        map.put("total",staffRepository.selectStaffByCon(staffByCon).size());
        return  map;
    }

    @Override
    public Staff getStaffDetail(int id) {
        return staffRepository.getStaffDetail(id);
    }

    public String updateStaff (Staff staff) {
        if (staffRepository.updateStaff(staff)>0){
            return "ok";
        }else {
            return "no";
        }

    }

    public  Map<String,Object> selectPeriodStaff (StaffByCon staffByCon){
        Map<String,Object> map = new HashMap<>();
        staffByCon.setAct("byPage");
        List<Staff> staffs = staffRepository.selectPeriodStaff(staffByCon);
        map.put("staffs",staffs);
        staffByCon.setAct("byNoPage");
        map.put("total",staffRepository.selectPeriodStaff(staffByCon).size());
        return  map;
    }

    @Override
    public Map<String, Object> selectPeriodStaffCon(PeriodByCon periodByCon) {
        Map<String,Object> map = new HashMap<>();
        periodByCon.setAct("byPage");
        List<Staff> staffs = staffRepository.selectPeriodStaffCon(periodByCon);
        map.put("staffs",staffs);
        periodByCon.setAct("byNoPage");
        map.put("total",staffRepository.selectPeriodStaffCon(periodByCon).size());
        return map;
    }

    @Override
    public String periodOp(int id, String status) {
        if (staffRepository.periodOp(id,status)>0){
            return "ok";
        }else {
            return "no";
        }
    }

    @Override
    public String deleteStaff(int id) {
        //先查询是否有关联数据
        List<Map<String, Object>>  listMap =staffRepository.selectAssociateStaff(id);
        if (listMap.size() <= 0) {
            if (staffRepository.deleteStaff(id) > 0)
                return "ok";
        }
        return "no";
    }

}
