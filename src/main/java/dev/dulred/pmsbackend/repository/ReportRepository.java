package dev.dulred.pmsbackend.repository;

import dev.dulred.pmsbackend.entity.Report;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ReportRepository {
    List<Map<String, Object>> reportSelectNew(Report report);
    List<Map<String, Object>>  reportSelectQuit(Report report);
    List<Map<String, Object>>  reportSelectTransfer(Report report);
}
