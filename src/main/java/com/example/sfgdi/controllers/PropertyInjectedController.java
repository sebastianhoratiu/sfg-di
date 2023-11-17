package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyInjectedGreetingsService")
    @Autowired
    public GreetingsService greetingsService;

    public String getGreeting() {
        return greetingsService.sayGreeting();
    }
}
