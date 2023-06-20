package dev.dulred.pmsbackend.repository;

import dev.dulred.pmsbackend.entity.PeriodByCon;
import dev.dulred.pmsbackend.entity.Staff;
import dev.dulred.pmsbackend.entity.StaffByCon;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StaffRepository {
    int addStaff (Staff staff);
    List<Staff> getStaff (StaffByCon staffByCon);
    List<Staff> selectStaffByCon (StaffByCon staffByCon);
    Staff getStaffDetail (int id);
    int updateStaff (Staff staff);
    List<Staff> selectPeriodStaff (StaffByCon staffByCon);
    List<Staff> selectPeriodStaffCon (PeriodByCon periodByCon);
    int periodOp (int id ,String status);
    List<Map<String, Object>>  selectAssociateStaff(int id);

    int deleteStaff(int id);
}
