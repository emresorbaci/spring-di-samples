package com.example.springdisamples.controller;

import com.example.springdisamples.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructerInjectedControllerTest {


    ConstructerInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructerInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.err.println(controller.getGreeting());
    }
}