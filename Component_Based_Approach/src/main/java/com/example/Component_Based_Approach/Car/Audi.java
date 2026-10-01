package com.example.Component_Based_Approach.Car;

import org.springframework.stereotype.Component;

@Component
	public class Audi implements Car {

		public String specs() {
			return "Audi is from xyz";
		}

	}




