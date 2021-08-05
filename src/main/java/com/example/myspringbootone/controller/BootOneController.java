package com.example.myspringbootone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
* Author:tam800
*
* */
@RestController
public class BootOneController {
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World !";
    }
}
