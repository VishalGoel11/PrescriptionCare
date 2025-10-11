package com.healthcare.PrescriptionCare.services;

import com.healthcare.PrescriptionCare.repository.Users;

import java.util.List;

public interface UsersService {

    Users create(Users user);
    Users update(int id, Users user);
    void delete(int id);
    List<Users> getAllUsers();
    Users getUserById(int id);

}
