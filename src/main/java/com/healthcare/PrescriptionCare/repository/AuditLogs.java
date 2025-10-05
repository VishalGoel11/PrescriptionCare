package com.healthcare.PrescriptionCare.repository;

import jakarta.persistence.*;
import lombok.Data;
import org.apache.catalina.User;

import java.time.LocalDateTime;

@Entity
@Table(name = "audit_logs")
@Data
public class AuditLogs {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "user_role")
    private String userRole;
    @Column(name = "entity_name")
    private String entityName;
    @Column(name = "entity_id")
    private String entityId;
    private String action;
    private String description;
    @Column(name = "old_value")
    private String oldValue;
    @Column(name = "new_value")
    private String newValue;
    private LocalDateTime timestamp;
}
