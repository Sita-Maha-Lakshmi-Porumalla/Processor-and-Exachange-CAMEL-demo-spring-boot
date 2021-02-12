package com.rame.demospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Welcome {

    @GetMapping("/welcome")
    public String sayHi(){
        return "Hello Sita Maha Lakshmi!";
    }

    @GetMapping("/error")
    public String home(){
        return "This is the Home Page.";
    }
}
