package com.example.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"SP","default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Holla Mundo - SP";
    }
}