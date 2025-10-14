package com.healthcare.PrescriptionCare.repositories;

import com.healthcare.PrescriptionCare.entities.PrescriptionDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionsDetailsRepo extends JpaRepository<PrescriptionDetails,String> {
}
