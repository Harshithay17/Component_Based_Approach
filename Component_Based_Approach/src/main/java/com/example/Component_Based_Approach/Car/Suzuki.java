package com.example.Component_Based_Approach.Car;

import org.springframework.stereotype.Component;

@Component("swift")
public class Suzuki implements Car {

	public String specs() {
		return "Hatchback from Suzuki";
	}

}


