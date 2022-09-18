package com.example.springdisamples.controller;

import com.example.springdisamples.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructerInjectedController {

    private final GreetingService greetingService;

    public ConstructerInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
