package com.iu.s2.ex2;

import java.util.Scanner;

public class StudentView {
	
	public void viewAll(Student [] students) {
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=======================================================");
		
		for(int i =0; i<students.length; i++) {
			System.out.print(students[i].name+"\t");
			System.out.print(students[i].num+"\t");
			System.out.print(students[i].kor+"\t");
			System.out.print(students[i].eng+"\t");
			System.out.print(students[i].math+"\t");
			System.out.print(students[i].total+"\t");
			System.out.println(students[i].avg);
			System.out.println("-------------------------------------------------------");
		}
	}
	
	public void viewOne(Student student) {
		
				System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
				System.out.println("=======================================================");
				System.out.print(student.name+"\t");
				System.out.print(student.num+"\t");
				System.out.print(student.kor+"\t");
				System.out.print(student.eng+"\t");
				System.out.print(student.math+"\t");
				System.out.print(student.total+"\t");
				System.out.println(student.avg);
				System.out.println("----------------------------------------------------");
				
		
	}
}
