package com.iu.s4;

public class Car {
	
	String company;
	String brand;
	String color;	
	int price;
	int gitong;
	
	//생성자
	public Car() {
		this("BLACK"); //자기자신의 또 다른 생성자 호출시 쓰임
	}
	
	//생성자 오버로딩
	public Car(String color) {
		this(color, 5000000);
	}
	
	public Car(String color, int price) {
		this.company="KIA";
		this.brand="K9";
		this.color=color;
		this.price=price;
		this.gitong=8;
	}
	
	public void info() {
		System.out.println("Company : " + company);		
		System.out.println("Brand : " + brand);
		System.out.println("Color : " + color);		
		System.out.println("Price : " + price);
		System.out.println("Gitong : " + gitong);
		System.out.println("--------------------------------");
	}
	
}
