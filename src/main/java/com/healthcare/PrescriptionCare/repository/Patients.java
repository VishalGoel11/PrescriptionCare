package com.healthcare.PrescriptionCare.repository;

import com.healthcare.PrescriptionCare.repository.Users;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "patients")
@Getter
@Setter
public class Patients {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "patient_id")
    private String patientId;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(name = "gender", length = 10)
    private String gender;   // Could be Enum if you prefer

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "contact_number", length = 15)
    private String contactNumber;

    @Column(name = "email", length = 150)
    private String email;

    @Column(name = "address", columnDefinition = "TEXT")
    private String address;

    @Column(name = "blood_group", length = 5)
    private String bloodGroup;

    @Column(name = "allergies", columnDefinition = "TEXT")
    private String allergies;  // e.g., "Penicillin, Sulfa drugs"

    @Column(name = "chronic_conditions", columnDefinition = "TEXT")
    private String chronicConditions; // e.g., "Diabetes, Hypertension"

    @Column(name = "emergency_contact_name", length = 100)
    private String emergencyContactName;

    @Column(name = "emergency_contact_number", length = 15)
    private String emergencyContactNumber;

    @ManyToOne
    @JoinColumn(name = "created_by_id")
    private Users createdBy;       // Doctor or Admin who created this patient

    @Column(name = "created_by_name", length = 100)
    private String createdByName;

    @ManyToOne
    @JoinColumn(name = "updated_by_id")
    private Users updatedBy;

    @Column(name = "updated_by_name", length = 100)
    private String updatedByName;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();

    @PreUpdate
    public void setUpdatedTimestamp() {
        this.updatedAt = LocalDateTime.now();
    }
}
