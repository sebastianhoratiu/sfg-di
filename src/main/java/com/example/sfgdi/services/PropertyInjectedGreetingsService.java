package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingsService implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello World! - property";
    }
}
