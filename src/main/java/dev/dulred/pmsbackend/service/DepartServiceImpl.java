package dev.dulred.pmsbackend.service;

import dev.dulred.pmsbackend.entity.Depart;
import dev.dulred.pmsbackend.entity.DepartByCon;
import dev.dulred.pmsbackend.repository.DepartRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepartServiceImpl implements DepartService {
    @Resource
    DepartRepository departRepository;
    @Override
    public List<Depart> selectDepart() {
        return departRepository.selectDepart(null);
    }
    public String addDepartment(Depart depart) {

        if (departRepository.addDepartment(depart) > 0){
            return "ok";
        }else
        {
            return "no";
        }

    }

    @Override
    public Map<String, Object> getDepartmentByPage(DepartByCon departByCon) {
        departByCon.setAct("byPage");
        List<Depart> departs = departRepository.selectDepart(departByCon);
        Map<String ,Object> map = new HashMap<>();
        map.put("departs",departs);
        map.put("total",departRepository.selectDepart(null).size());
        return map;
    }

    public Map<String,Object> selectDepartmentsByCon (DepartByCon departByCon){
        Map<String,Object> map = new HashMap<>();
        departByCon.setAct("byPage");
        List<Depart> departs  = departRepository.selectDepartmentsByCon(departByCon);
        map.put("departs",departs);
        departByCon.setAct("byNoPage");
        map.put("total",departRepository.selectDepartmentsByCon(departByCon).size());
        return  map;
    }

    @Override
    public String deleteDepartment(int id) {
        //先查询是否有关联数据
        List<Map<String, Object>>  listMap =departRepository.selectAssociateDepart(id);
        if (listMap.size() <= 0) {
            if (departRepository.deleteDepartment(id) > 0)
                return "ok";
        }
        return "no";
    }
    public Map<String,Object> getDepartmentDetail (int id) {
        Map<String,Object> map = new HashMap<>();
        List<Depart> departs = departRepository.selectDepart(null);
        map.put("departs",departs);
        Depart depart = departRepository.getDepartmentDetail(id);
        map.put("adepart",depart);
        return map;
    }

    public String updateDepartment(Depart depart) {
        if(departRepository.updateDepartment(depart) > 0)
            return "ok";
        return "no";
    }



}
