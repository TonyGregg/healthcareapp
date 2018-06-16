package com.genil.healthapp.controllers;

import com.genil.healthapp.model.HelloMessage;
import com.genil.healthapp.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by genil on 6/16/18 at 11 03
 **/
@RestController
public class RestGreetingController {
    @PostMapping(value = "/hello", produces = "application/json")
//    @ResponseBody It is not required if the controller is @RestController. That is why return was json without this annotation !!!
    public HelloMessage greetUser(@RequestBody User user) {
        HelloMessage helloMessage = new HelloMessage();

        helloMessage.setMessage("Hello Mr. / Mrs. " + user.getFirstname()+ " ! How are you doing? What a lovely weather !");
        helloMessage.setName(user.getFirstname());

        return helloMessage;
    }
}
