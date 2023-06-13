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
}
