package com.example.sfgdi.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}
