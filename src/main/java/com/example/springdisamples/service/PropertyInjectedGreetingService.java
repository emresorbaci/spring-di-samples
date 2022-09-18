package com.example.springdisamples.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world - Property";
    }
}
