package com.example.demospringdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import main.java.com.example.demospringdi.Customers;

@SpringBootApplication
public class DemoSpringDiApplication {

	public static void main(String[] args) {
		
		//SpringApplication.run(DemoSpringDiApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(DemoSpringDiApplication.class, args);
		Customers c = context.getBean(customers.class);
		c.display();
	}

}
