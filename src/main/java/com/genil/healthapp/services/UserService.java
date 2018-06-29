package com.genil.healthapp.services;

import com.genil.healthapp.domain.User;

import java.util.List;

/**
 * Created by genil on 6/17/18 at 01 58
 **/
public interface UserService {
    public List<User> getUsersByLastName(String lastName);
}
