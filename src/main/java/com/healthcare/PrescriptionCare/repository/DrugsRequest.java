package com.healthcare.PrescriptionCare.repository;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "drugs_request")
@Data
public class DrugsRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "drug_id")
    private String drugId;
    @Column(name = "drug_name")
    private String drugName;
    @Column(name = "generic_name")
    private String genericName;
    private String form;
    private String strength;
    private String manufacturer;
    @Column(name = "total_price")
    private String totalPrice;
    @Column(name = "price_per_unit")
    private String pricePerUnit;
    @Column(name = "expiry_date")
    private String expiryDate;
    @Column(name = "available_stock")
    private String availableStock;
    private String status;
    @Column(name = "created_by_user")
    private String createdByUser;
    @Column(name = "created_at")
    private String createdAt;
    @Column(name = "updated_by_user")
    private String updatedByUser;
    @Column(name = "updated_at")
    private String updatedAt;
}
