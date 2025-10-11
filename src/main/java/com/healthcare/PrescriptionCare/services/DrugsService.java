package com.healthcare.PrescriptionCare.services;

import com.healthcare.PrescriptionCare.repository.Drugs;

import java.util.List;

public interface DrugsService {
    Drugs create(Drugs user);
    Drugs update(int id, Drugs user);
    void delete(int id);
    List<Drugs> getAllUsers();
    Drugs getUserById(int id);
}
