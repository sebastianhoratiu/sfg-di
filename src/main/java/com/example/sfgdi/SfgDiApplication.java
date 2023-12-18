package com.example.sfgdi;

import com.example.sfgdi.controllers.*;
import com.example.sfgdi.services.LifeCycleDemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

//		SpringApplication.run(SfgDiApplication.class, args);

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        System.out.println("------- Profiles");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("------- Primary");
        System.out.println(myController.sayHello());

        System.out.println("------- Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------- Setter");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());


        System.out.println("------- Controller");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());

    }


}
