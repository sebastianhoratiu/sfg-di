package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingsService implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello World! - constructor";
    }
}
