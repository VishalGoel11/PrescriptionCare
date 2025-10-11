package com.healthcare.PrescriptionCare.services;

import com.healthcare.PrescriptionCare.repository.Patients;

import java.util.List;

public interface PatientsService {
    Patients create(Patients user);
    Patients update(int id, Patients user);
    void delete(int id);
    List<Patients> getAllUsers();
    Patients getUserById(int id);
}
