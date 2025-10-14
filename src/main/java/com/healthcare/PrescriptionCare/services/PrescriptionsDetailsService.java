package com.healthcare.PrescriptionCare.services;

import com.healthcare.PrescriptionCare.entities.PrescriptionDetails;

import java.util.List;

public interface PrescriptionsDetailsService {
    PrescriptionDetails create(PrescriptionDetails user);
    PrescriptionDetails update(String id, PrescriptionDetails user);
    void delete(String id);
    List<PrescriptionDetails> getAllUsers();
    PrescriptionDetails getUserById(String id);
}
