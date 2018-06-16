package com.genil.healthapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by genil on 6/16/18 at 10 15
 **/
@Controller
@RequestMapping("/account/*")
public class AccountController {
    @RequestMapping
    public String login(){
        return "login";
    }

    @GetMapping("/signup")
    public String goSignup() {
        return "signup";
    }

    @GetMapping("logout")
    public String goLogout() {
        return "logout";
    }

    @PostMapping("/signup/proess")
    public String processSignup(ModelMap modelMap, @RequestParam("nickName") String nickName,
                                @RequestParam("emailAddress") String emailAddress,
                                @RequestParam("password") String password) {

        modelMap.addAttribute("login",Boolean.TRUE);
        modelMap.addAttribute("nickName",nickName);

        return "index";
    }
}
