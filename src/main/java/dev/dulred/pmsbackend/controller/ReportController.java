package dev.dulred.pmsbackend.controller;

import dev.dulred.pmsbackend.entity.Report;
import dev.dulred.pmsbackend.service.ReportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class ReportController {

    @Resource
    private ReportService reportService;
    @PostMapping("/getNewStaffReport")
    public Map<String, Object> getNewStaffReport( @RequestBody Report report){
        System.out.println(report.toString());
        return reportService.getNewStaffReport(report);
    }
    @PostMapping("/selectNewStaffReportByCon")
    public Map<String, Object> selectNewStaffReportByCon(@RequestBody Report report){
        return reportService.getNewStaffReport(report);
    }
    @PostMapping("/getQuitStaffReport")
    public Map<String, Object> getQuitStaffReport( @RequestBody Report report){
        return reportService.getQuitStaffReport(report);
    }
    @PostMapping("/selectQuitStaffReportByCon")
    public Map<String, Object> selectQuitStaffReportByCon(@RequestBody Report report){
        return reportService.getQuitStaffReport(report);
    }
    @PostMapping("/getTransferReport")
    public Map<String, Object> getTransferReport( @RequestBody Report report){
        return reportService.getTransferReport(report);
    }
    @PostMapping("/selectTransferStaffReportByCon")
    public Map<String, Object> selectTransferStaffReportByCon(@RequestBody Report report){
        return reportService.getTransferReport(report);
    }
}
