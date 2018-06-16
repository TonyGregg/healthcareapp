package com.genil.healthapp.repositories;

import com.genil.healthapp.domain.Doctor;

import java.util.List;

/**
 * Created by genil on 6/16/18 at 15 09
 **/
public interface DoctorDAO {
    List<Doctor> findAll();

    List<Doctor> findBySpecialityCode(String code);

    int findAllCount();

    List<Doctor> findByLocation(String location);

    List<Doctor> findByHospital(String hospitalName);

    Doctor findByUserId(int userId);

    Doctor save(Doctor doctor);
}

