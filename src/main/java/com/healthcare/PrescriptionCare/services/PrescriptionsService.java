package com.healthcare.PrescriptionCare.services;

import com.healthcare.PrescriptionCare.repository.Prescriptions;

import java.util.List;

public interface PrescriptionsService {
    Prescriptions create(Prescriptions user);
    Prescriptions update(int id, Prescriptions user);
    void delete(int id);
    List<Prescriptions> getAllUsers();
    Prescriptions getUserById(int id);
}
