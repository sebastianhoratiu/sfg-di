package com.example.sfgdi.controllers;

import com.example.sfgdi.services.ConstructorInjectedGreetingsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingsService = new ConstructorInjectedGreetingsService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}