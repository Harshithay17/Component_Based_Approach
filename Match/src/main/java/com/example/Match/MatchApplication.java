package com.example.Match;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MatchApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MatchApplication.class, args);

		Customer c = context.getBean(Customer.class);
		c.display();

	}

}
