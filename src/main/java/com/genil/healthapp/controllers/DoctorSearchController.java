package com.genil.healthapp.controllers;

import com.genil.healthapp.domain.Doctor;
import com.genil.healthapp.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by genil on 6/16/18 at 17 35
 **/
@RestController
public class DoctorSearchController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctors")
    public List<Doctor> searchDoctor(@RequestParam(value = "speciality", required = false) String speciality) {
        return doctorService.findBySpeciality(speciality);
    }
}
