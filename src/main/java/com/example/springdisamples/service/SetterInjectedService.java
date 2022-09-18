package com.example.springdisamples.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "hello world - setter";
    }
}
