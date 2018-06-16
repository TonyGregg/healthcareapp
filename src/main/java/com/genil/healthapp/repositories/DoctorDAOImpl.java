package com.genil.healthapp.repositories;

import com.genil.healthapp.domain.Doctor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by genil on 6/16/18 at 16 46
 **/
@Repository
@Transactional
public class DoctorDAOImpl implements DoctorDAO {

    @Autowired
    public DoctorDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    private SessionFactory sessionFactory;

//    @Override
//    public List<Doctor> findByLocationAndSpeciality(String location, String speciality) {
//        Session session = this.sessionFactory.getCurrentSession();
//
//        TypedQuery<Doctor> doctorTypedQuery = session.getNamedQuery("findByLocationAndSpeciality");
//        doctorTypedQuery.setParameter("specialityCode",speciality);
//        doctorTypedQuery.setParameter("location",location);
//
//        List<Doctor> doctors = doctorTypedQuery.getResultList();
//
//        return doctors;
//
//
//    }

    @Override
    public List<Doctor> findAll() {
        return null;
    }

    @Override
    public List<Doctor> findBySpecialityCode(String code) {
        Session session = sessionFactory.getCurrentSession();
        TypedQuery<Doctor> doctorTypedQuery = session.getNamedQuery("findBySpeciality");
        doctorTypedQuery.setParameter("specialityCode",code);

        List<Doctor> doctors = doctorTypedQuery.getResultList();
        return doctors;

    }

    @Override
    public int findAllCount() {
        return 0;
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
    public Doctor findByUserId(int userId) {
        return null;
    }

    @Override
    public Doctor save(Doctor doctor) {
        return null;
    }
}
