package com.healthcare.PrescriptionCare.repositories;

import com.healthcare.PrescriptionCare.entities.Patients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientsRepo extends JpaRepository<Patients,String> {
}
