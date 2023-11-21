package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingsService;
import com.example.sfgdi.services.PrimaryGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingsService greetingsService;

    public MyController(GreetingsService greetingService) {
        this.greetingsService = greetingService;
    }

    public String sayHello() {

        return greetingsService.sayGreeting();
    }
}
