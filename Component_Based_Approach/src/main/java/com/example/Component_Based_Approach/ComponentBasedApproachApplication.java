package com.example.Component_Based_Approach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Component_Based_Approach.Car.Car;

@SpringBootApplication
public class ComponentBasedApproachApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentBasedApproachApplication.class, args);
		AnnotationConfigApplicationContext context = 
				new	AnnotationConfigApplicationContext(App_Config.class);
			
			Car myCar = context.getBean("swift",Car.class);
			System.out.println(myCar.specs());
			context.close();

	
	
	}

}
