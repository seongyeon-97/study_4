package com.iu.s2;

import java.util.Scanner;

public class Method1 {
	//접근지정자 그외지정자 리턴타입 메서드명 (매개변수 선언) { }
	
	//접근지정자는 모르거나 확신이 없을 시 public 쓰기
	//그 외 지정자는 모르거나 확신이 없을 시 사용X
	//리턴 타입은 모르거나 확신이 없을 시 void
	//매개변수는 모르거나 확신이 없을 시 쓰지 마세요
	public void prn() {
		//print, if, for문
		System.out.println("prn 실행");
	}
	
	public void prn2() {	
		Scanner sc = new Scanner(System.in);
		System.out.println("횟수를 임력하세요.");
		int a = sc.nextInt();		
		for(int i=0; i<a; i++) {
			System.out.println("Hello!!");	
		}
	}
	
	public void prn3() {
		System.out.println("Hello");
	}
	
	public void prn4(int num) {
		
		for(int i=0; i<num; i++) {
			System.out.println("Hello");
		}
	}
}
