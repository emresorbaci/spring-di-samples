package com.example.springdisamples.controller;

import org.springframework.stereotype.Controller;

@Controller
public class TestController  {

    public String sayHello() {

        System.err.println("hello world");
        return "Hi Folks";
    }

}
