package com.healthcare.PrescriptionCare.controllers;

import com.healthcare.PrescriptionCare.services.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientsController {

    @Autowired
    private PatientsService service;



}
