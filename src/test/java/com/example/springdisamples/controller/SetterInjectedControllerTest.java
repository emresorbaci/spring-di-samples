package com.example.springdisamples.controller;

import com.example.springdisamples.service.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new SetterInjectedController();

        controller.setGreetingService(new ConstructorGreetingService());

    }

    @Test
    void getGreeting() {
        System.err.println(controller.getGreeting());
    }
}