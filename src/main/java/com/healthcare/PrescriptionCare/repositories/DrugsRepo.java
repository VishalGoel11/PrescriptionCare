package com.healthcare.PrescriptionCare.repositories;

import com.healthcare.PrescriptionCare.entities.Drugs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugsRepo extends JpaRepository<Drugs,String> {
}
