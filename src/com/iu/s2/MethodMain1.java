package com.iu.s2;

import java.util.Scanner;

public class MethodMain1 {

	public static void main(String[] args) {
		System.out.println("-------Method1 Start-------");
		
		Method1 mth1 = new Method1();
		mth1.prn();
		//mth1.prn2();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("횟수를 임력하세요.");
		int count = sc.nextInt();
		
		
//		for(int i=0;i<count; i++) {
//			mth1.prn3();
//		}
		
		mth1.prn4(count); //count가 인자값이 된다.
		
		System.out.println("-------Method1 finish-------");
		
	}

}
