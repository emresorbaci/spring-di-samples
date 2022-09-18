package com.example.springdisamples;

import com.example.springdisamples.controller.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiSamplesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiSamplesApplication.class, args);

		TestController testController = (TestController) ctx.getBean("testController");

		String greeting = testController.sayHello();
		System.err.println(greeting);

	}

}
