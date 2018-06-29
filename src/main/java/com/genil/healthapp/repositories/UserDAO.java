package com.genil.healthapp.repositories;

import com.genil.healthapp.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by genil on 6/17/18 at 01 51
 **/
@Repository
@Transactional
public class UserDAO {
    Logger logger = LoggerFactory.getLogger(UserDAO.class);
    @Autowired
    public UserDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private SessionFactory sessionFactory;

    public List<User> findUserByLastName(String lastName) {
        logger.info("finally at the DAO call... "+lastName);
        Session session = sessionFactory.getCurrentSession();
        TypedQuery<User> userTypedQuery = session.getNamedQuery("findByLastName");

        userTypedQuery.setParameter("lastName",lastName);

        List<User> users = userTypedQuery.getResultList();

        return users;
    }

    public User findUserByEmail(String email) {
        return null;
    }
}
