package com.example.springdisamples.controller;

import com.example.springdisamples.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class TestController  {


    private final GreetingService greetingService;

    public TestController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {

        return greetingService.sayGreeting();
    }

}
