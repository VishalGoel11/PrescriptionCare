package com.healthcare.PrescriptionCare.servicesimplementation;

import com.healthcare.PrescriptionCare.entities.Patients;
import com.healthcare.PrescriptionCare.exceptions.UnableToSaveEntity;
import com.healthcare.PrescriptionCare.repositories.PatientsRepo;
import com.healthcare.PrescriptionCare.services.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientsServiceImpl implements PatientsService {

    @Autowired
    private PatientsRepo repo;

    @Override
    public Patients create(Patients user) {
            return this.repo.save(user);
    }

    @Override
    public Patients update(String id, Patients user) {
        user.setPatientId(id);
        return this.repo.save(user);
    }

    @Override
    public void delete(String id) {
        this.repo.deleteById(id);
    }

    @Override
    public List<Patients> getAllUsers() {
        return this.repo.findAll();
    }

    @Override
    public Patients getUserById(String id) {
        Optional<Patients> user = this.repo.findById(id);
        return user.orElse(null);
    }

}
