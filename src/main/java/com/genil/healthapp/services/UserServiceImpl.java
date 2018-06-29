package com.genil.healthapp.services;

import com.genil.healthapp.domain.User;
import com.genil.healthapp.repositories.UserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by genil on 6/17/18 at 02 00
 **/
@Service
public class UserServiceImpl implements UserService{
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    private UserDAO userDAO;

    @Override
    public List<User> getUsersByLastName(String lastName) {
        logger.info("Inside getUsers by last name "+lastName + " User DAO "+userDAO);
        return userDAO.findUserByLastName(lastName);
    }
}
