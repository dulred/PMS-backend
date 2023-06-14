package dev.dulred.pmsbackend.service;

import dev.dulred.pmsbackend.entity.Depart;
import dev.dulred.pmsbackend.entity.DepartByCon;

import java.util.List;
import java.util.Map;

public interface DepartService {
    List<Depart> selectDepart();
    String addDepartment(Depart depart);

    Map<String,Object> getDepartmentByPage (DepartByCon departByCon);
    Map<String,Object> selectDepartmentsByCon(DepartByCon departByCon);
    String deleteDepartment (int id);

    Map<String,Object> getDepartmentDetail (int id);

    String updateDepartment (Depart depart);

}
