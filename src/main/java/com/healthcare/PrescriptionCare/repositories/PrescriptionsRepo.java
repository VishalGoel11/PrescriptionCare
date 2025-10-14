package com.healthcare.PrescriptionCare.repositories;

import com.healthcare.PrescriptionCare.entities.Prescriptions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionsRepo extends JpaRepository<Prescriptions,String> {
}
