package com.iu.s4;

public class Test {
	
	int num;
	
	int num2 = 2;
	
	int num4;
	{
		//초기화블럭
		System.out.println("초기화 블럭");
		num4 = 4;
	}
	
	int num3;	
	public Test () {
		System.out.println("생성자");
		num3 = 3;
		num2 = 22;
		num4 = 44;
	}
	
	int num5;
	
	public void numSet() {
		this.num5 = 5;
	}
}
