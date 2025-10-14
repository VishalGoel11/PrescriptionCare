package com.healthcare.PrescriptionCare.services;

import com.healthcare.PrescriptionCare.entities.Drugs;

import java.util.List;

public interface DrugsService {
    Drugs create(Drugs user);
    Drugs update(String id, Drugs user);
    void delete(String id);
    List<Drugs> getAllUsers();
    Drugs getUserById(String id);
}
