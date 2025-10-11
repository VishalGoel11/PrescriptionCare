package com.healthcare.PrescriptionCare.services;

import com.healthcare.PrescriptionCare.repository.DrugsRequest;

import java.util.List;

public interface DrugsRequestService {
    DrugsRequest create(DrugsRequest user);
    DrugsRequest update(int id, DrugsRequest user);
    void delete(int id);
    List<DrugsRequest> getAllUsers();
    DrugsRequest getUserById(int id);
}
