package com.example.springcontext;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext

public class SpringContextApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringContextApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfigiration.class);
		SpringContextApplication app = context.getBean(SpringContextApplication.class);
		
		app.processMessage("Hi Pankaj", "pankaj@abc.com");
		
		//close the context
		context.close();
	}

}
