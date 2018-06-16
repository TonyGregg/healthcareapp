package com.genil.healthapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by genil on 6/16/18 at 04 59
 **/
@Controller

public class HelloController {

    @RequestMapping("/")
    public String sayHello(String name) {
        return "index";
    }

}
