package com.healthcare.PrescriptionCare.services;

import com.healthcare.PrescriptionCare.entities.Patients;

import java.util.List;

public interface PatientsService {
    Patients create(Patients user);
    Patients update(String id, Patients user);
    void delete(String id);
    List<Patients> getAllUsers();
    Patients getUserById(String id);
}
