package com.genil.healthapp.controllers;

import com.genil.healthapp.domain.User;
import com.genil.healthapp.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * Created by genil on 6/17/18 at 02 02
 **/
@RestController
@RequestMapping(value = {"/users","/anotheruser/","/heyonemoreway"})
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/getUserByLastName")
    public Iterable<User>getUserByLastName(@RequestBody User user) {
        logger.info("Inside the controller. Last name passed "+user.getLastname());
        return userRepository.findAll();
    }

    @GetMapping(value = "/sayHello")
    public String sayHello() {
        return "hello";
    }


    /**
     * Query parameter test
     * something like /users?name=Antony,age=35,address=Vaniyaudy,zipCode=33568
     */
    @GetMapping(value = "/testQueryParam")
    public void queryParamTest(@RequestParam("name")String name,
                               @RequestParam("age") int age,
                               @RequestParam(value = "address",defaultValue = "Nagercoil") String address,
                               @RequestParam(value = "zipCode",defaultValue = "33569")int zipCode) {
        /**
         * Do something with name and age
         */
        age+=2;
        System.out.println("Zip code "+zipCode);

    }


    /**
     * Path parameter test
     *
     * something like
     * /users/in/Nagercoil
     *
     * instead of
     *
     * /users/show?place=Nagercoil
     */
    @GetMapping(value = "/users/in/{location}")
    public void getUsersInLocation(@PathVariable("location") String location) {

    }

    /**
     * other way of wrting is
     */
    @GetMapping(value = "/users/in/{location}")
    public void getUserLocationWay2Simple(@PathVariable String location) {

    }



}
