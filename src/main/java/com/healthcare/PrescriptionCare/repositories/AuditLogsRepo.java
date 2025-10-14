package com.healthcare.PrescriptionCare.repositories;

import com.healthcare.PrescriptionCare.entities.AuditLogs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditLogsRepo extends JpaRepository<AuditLogs,String> {
}
