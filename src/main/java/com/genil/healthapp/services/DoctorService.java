package com.genil.healthapp.services;

import com.genil.healthapp.domain.Doctor;
import com.genil.healthapp.domain.User;

import java.util.List;

/**
 * Created by genil on 6/16/18 at 17 05
 **/
public interface DoctorService {

    void save(Doctor doctor);

    List<Doctor> findBySpeciality(String specialityCode);

    List<Doctor> findByLocation(String location);

    List<Doctor> findByHospital(String hospitalName);

    List<Doctor> findAll();

    Doctor findByUserEmailAddress(String email);

    int findCount();

    Doctor findByUserId(int userId);

    void addDoctor(User user);
}
