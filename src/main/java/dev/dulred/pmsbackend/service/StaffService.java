package dev.dulred.pmsbackend.service;

import dev.dulred.pmsbackend.entity.Staff;
import dev.dulred.pmsbackend.entity.StaffByCon;

import java.util.List;
import java.util.Map;

public interface StaffService {
    String addStaff (Staff staff);
    Map<String , Object> getStaff( StaffByCon staffByCon);
    Map<String , Object> selectStaffByCon( StaffByCon staffByCon);
    Staff getStaffDetail (int id);
    String updateStaff (Staff staff);
}
