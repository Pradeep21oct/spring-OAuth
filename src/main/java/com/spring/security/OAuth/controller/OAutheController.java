package com.spring.security.OAuth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAutheController {
    @GetMapping("hello")
    public String helloOAuth(){
        return "WelCome OAuth2";
    }
    @GetMapping("login")
    public String login(){
        return "WelCome  OAuth2 login";
    }
}
