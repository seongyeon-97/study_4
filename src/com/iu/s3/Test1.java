package com.iu.s3;

public class Test1 {
	//맴버변수
	int num;
	int num2;
	
	//멤버메서드
	public void info() {
		//메서드 내에서 다른 메서드 호출이 가능?
		int age;
		System.out.println("Info Method 실행");
		System.out.println(num);
		
		this.info2();
	}
	
	public void info2() {
		System.out.println(this.num*this.num2);
		System.out.println("This : " + this);
	}
	
	public void info3(int num) {
		System.out.println(this.num - num);
	}
	
	
}
