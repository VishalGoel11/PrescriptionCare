package com.healthcare.PrescriptionCare.services;

import com.healthcare.PrescriptionCare.entities.Users;

import java.util.List;

public interface UsersService {

    Users create(Users user);
    Users update(String id, Users user);
    void delete(String id);
    List<Users> getAllUsers();
    Users getUserById(String id);

}
