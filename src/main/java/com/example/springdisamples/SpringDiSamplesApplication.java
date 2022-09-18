package com.example.springdisamples;

import com.example.springdisamples.controller.ConstructerInjectedController;
import com.example.springdisamples.controller.PropertyInjectedController;
import com.example.springdisamples.controller.SetterInjectedController;
import com.example.springdisamples.controller.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiSamplesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiSamplesApplication.class, args);

		TestController testController = (TestController) ctx.getBean("testController");

		System.err.println("-------primary ");
		System.err.println(testController.sayHello());


		System.err.println("-------property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.err.println(propertyInjectedController.sayGreeting());


		System.err.println("-------setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.err.println(setterInjectedController.getGreeting());

		System.err.println("-------constructor");

		ConstructerInjectedController constructerInjectedController = (ConstructerInjectedController) ctx.getBean("constructerInjectedController");

		System.err.println(constructerInjectedController.getGreeting());

	}

}
