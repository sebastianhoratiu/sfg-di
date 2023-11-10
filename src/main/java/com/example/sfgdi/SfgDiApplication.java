package com.example.sfgdi;

import com.example.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(SfgDiApplication.class, args);
//	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) applicationContext.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("ApplicationName=" + applicationContext.getApplicationName());

		System.out.println("DisplayName=" + applicationContext.getDisplayName());

		System.out.println("ApplicationContext.toString=" + applicationContext.toString());
	}

}
