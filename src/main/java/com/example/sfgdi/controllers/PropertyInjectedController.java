package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingsService;

public class PropertyInjectedController {
    public GreetingsService greetingsService;

    public String getGreeting() {
        return greetingsService.sayGreeting();
    }
}
