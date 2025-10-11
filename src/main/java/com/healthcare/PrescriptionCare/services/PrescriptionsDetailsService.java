package com.healthcare.PrescriptionCare.services;

import com.healthcare.PrescriptionCare.repository.PrescriptionDetails;

import java.util.List;

public interface PrescriptionsDetailsService {
    PrescriptionDetails create(PrescriptionDetails user);
    PrescriptionDetails update(int id, PrescriptionDetails user);
    void delete(int id);
    List<PrescriptionDetails> getAllUsers();
    PrescriptionDetails getUserById(int id);
}
