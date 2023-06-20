package dev.dulred.pmsbackend.service;

import dev.dulred.pmsbackend.entity.Report;

import java.util.List;
import java.util.Map;

public interface ReportService {
    Map<String, Object> getNewStaffReport(Report report);
    Map<String, Object> getQuitStaffReport(Report report);
    Map<String, Object> getTransferReport(Report report);
}
