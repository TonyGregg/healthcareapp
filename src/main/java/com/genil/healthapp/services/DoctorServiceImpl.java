package com.genil.healthapp.services;

import com.genil.healthapp.domain.Doctor;
import com.genil.healthapp.domain.User;
import com.genil.healthapp.repositories.DoctorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by genil on 6/16/18 at 17 06
 **/

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    public DoctorServiceImpl(DoctorDAO doctorDAO) {
        this.doctorDAO = doctorDAO;
    }

    private DoctorDAO doctorDAO;

    @Override
    public void save(Doctor doctor) {

    }

    @Override
    public List<Doctor> findBySpeciality(String specialityCode) {
        return doctorDAO.findBySpecialityCode(specialityCode);
    }

    @Override
    public List<Doctor> findByLocation(String location) {
        return null;
    }

    @Override
    public List<Doctor> findByHospital(String hospitalName) {
        return null;
    }

    @Override
    public List<Doctor> findAll() {
        return null;
    }

    @Override
    public Doctor findByUserEmailAddress(String email) {
        return null;
    }

    @Override
    public int findCount() {
        return 0;
    }

    @Override
    public Doctor findByUserId(int userId) {
        return null;
    }

    @Override
    public void addDoctor(User user) {

    }
}
