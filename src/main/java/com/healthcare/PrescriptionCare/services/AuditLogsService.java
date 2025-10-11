package com.healthcare.PrescriptionCare.services;

import com.healthcare.PrescriptionCare.repository.AuditLogs;

import java.util.List;

public interface AuditLogsService {
    AuditLogs create(AuditLogs user);
    AuditLogs update(int id, AuditLogs user);
    void delete(int id);
    List<AuditLogs> getAllUsers();
    AuditLogs getUserById(int id);
}
