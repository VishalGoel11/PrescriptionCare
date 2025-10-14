package com.healthcare.PrescriptionCare.services;

import com.healthcare.PrescriptionCare.entities.DrugsRequest;

import java.util.List;

public interface DrugsRequestService {
    DrugsRequest create(DrugsRequest user);
    DrugsRequest update(String id, DrugsRequest user);
    void delete(String id);
    List<DrugsRequest> getAllUsers();
    DrugsRequest getUserById(String id);
}
