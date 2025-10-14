package com.healthcare.PrescriptionCare.services;

import com.healthcare.PrescriptionCare.entities.Prescriptions;

import java.util.List;

public interface PrescriptionsService {
    Prescriptions create(Prescriptions user);
    Prescriptions update(String id, Prescriptions user);
    void delete(String id);
    List<Prescriptions> getAllUsers();
    Prescriptions getUserById(String id);
}
