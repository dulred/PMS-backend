package dev.dulred.pmsbackend.repository;

import dev.dulred.pmsbackend.entity.Staff;
import dev.dulred.pmsbackend.entity.StaffByCon;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepository {
    int addStaff (Staff staff);
    List<Staff> getStaff (StaffByCon staffByCon);
    List<Staff> selectStaffByCon (StaffByCon staffByCon);
    Staff getStaffDetail (int id);
    int updateStaff (Staff staff);
}
