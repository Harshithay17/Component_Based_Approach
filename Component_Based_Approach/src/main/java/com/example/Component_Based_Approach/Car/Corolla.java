package com.example.Component_Based_Approach.Car;

import org.springframework.stereotype.Component;

@Component
public class Corolla implements Car {

	public String specs() {
		return "Sedan from Toyota";
	}

}



