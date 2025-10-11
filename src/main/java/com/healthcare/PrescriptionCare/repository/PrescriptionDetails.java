package com.healthcare.PrescriptionCare.repository;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name = "prescription_details")
@Getter
@Setter
public class PrescriptionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "detail_id")
    private String detailId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prescription_id", nullable = false)
    private Prescriptions prescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "drug_id", nullable = false)
    private Drugs drug;

    @Column(name = "dosage", length = 50)
    private String dosage; // e.g. "500 mg"

    @Column(name = "frequency", length = 50)
    private String frequency; // e.g. "3 times/day"

    @Column(name = "duration", length = 50)
    private String duration; // e.g. "5 days"

    @Column(name = "quantity")
    private Integer quantity; // e.g. 15 tablets

    @Column(name = "instructions", columnDefinition = "TEXT")
    private String instructions; // e.g. "Take after meals"

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();

    @PreUpdate
    public void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}
