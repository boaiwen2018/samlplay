package com.bobo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/welcome"})
public class WelcomeController {

    @RequestMapping
    public String hello(){
        return "hello";
    }

}
