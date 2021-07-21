package com.iu.s4;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {

		Car car = new Car();		
		
		Car car2 = new Car("RED");
		
		Car car3 = new Car("PINK", 7000000);
		
		car.info();
		car2.info();	
		car3.info();
	}

}
