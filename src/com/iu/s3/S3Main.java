package com.iu.s3;

public class S3Main {

	public static void main(String[] args) {
		//System.out.println("----S3Main start----");
		
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		
		t1.num = 3;
		t1.num2 = 5;
		
		t2.num = 900;
		
		t1.info();
		t2.info();
		
		System.out.println("T1 : " + t1);
		System.out.println("T2 : " + t2);
		
		t1.info2();
		t2.info2();
		t1.info3(10);
		//System.out.println("----S3Main finish----");

	}

}
