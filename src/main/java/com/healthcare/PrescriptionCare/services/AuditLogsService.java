package com.healthcare.PrescriptionCare.services;

import com.healthcare.PrescriptionCare.entities.AuditLogs;

import java.util.List;

public interface AuditLogsService {
    AuditLogs create(AuditLogs user);
    AuditLogs update(String id, AuditLogs user);
    void delete(String id);
    List<AuditLogs> getAllUsers();
    AuditLogs getUserById(String id);
}
