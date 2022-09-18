package com.example.springdisamples.controller;

import com.example.springdisamples.service.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructerInjectedControllerTest {


    ConstructerInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructerInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.err.println(controller.getGreeting());
    }
}