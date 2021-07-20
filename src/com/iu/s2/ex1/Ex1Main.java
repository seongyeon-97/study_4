package com.iu.s2.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("----Ex1Main start----");		
		
		Phone phone = new Phone();
		phone.make = "삼성";
		phone.brand = "갤럭시";
		phone.color = "BLACK";
		phone.size = 12;	
		phone.price = 100000;
		
		Phone phone2 = new Phone();
		phone2.make = "애플";
		phone2.brand = "아이폰";
		phone2.color = "PINK";
		phone2.size = 10;	
		phone2.price = 900000;
		
		PhoneView pv1 = new PhoneView();
		pv1.view(phone);
		
		Phone [] phones = new Phone[2];
		phones[0] = phone;
		phones[1] = phone2;
		
		pv1.pricehap(phones);
		
//		System.out.println(phone.make);
//		System.out.println(phone.brand);
//		System.out.println(phone.color);
//		System.out.println(phone.size);
//		System.out.println(phone.price);
//		
		System.out.println("----Ex1Main finish----");

	}

}
