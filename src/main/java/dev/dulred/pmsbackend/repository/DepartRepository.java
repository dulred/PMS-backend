package dev.dulred.pmsbackend.repository;

import dev.dulred.pmsbackend.entity.Depart;
import dev.dulred.pmsbackend.entity.DepartByCon;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DepartRepository {
    List<Depart>  selectDepart(DepartByCon departByCon);
    int addDepartment(Depart depart);
    List<Depart>  selectDepartmentsByCon (DepartByCon departByCon);
    int deleteDepartment (int id);

    Depart getDepartmentDetail (int id);
    int updateDepartment (Depart depart);
    List<Map<String, Object>> selectAssociateDepart(int id);
}
