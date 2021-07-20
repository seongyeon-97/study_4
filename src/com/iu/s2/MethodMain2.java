package com.iu.s2;

import java.util.Random;

public class MethodMain2 {

	public static void main(String[] args) {
		
		Method2 m2 = new Method2();
		
		m2.t1(); //void
		
		String name = m2.t2(); //int
		System.out.println(name);
		
		int total = m2.t3(3432, 22455); //int
		System.out.println(total);
		
		int [] ar = m2.t4(); //
		System.out.println(ar);
		
		Random random = new Random();
		int r = random.nextInt();
		System.out.println(r);
		
		m2.t5();
		
	}

}
