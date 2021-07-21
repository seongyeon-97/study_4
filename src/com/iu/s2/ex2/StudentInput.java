package com.iu.s2.ex2;

import java.util.Scanner;

public class StudentInput {
	
	public Student makeStudent() {
		
		Student student = new Student();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		student.name = sc.next();
		
		System.out.println("번호 : ");
		student.num = sc.nextInt();
		
		System.out.println("국어점수 : ");
		student.kor = sc.nextInt();
		
		System.out.println("영어점수 : ");
		student.eng = sc.nextInt();
		
		System.out.println("수학점수 : ");
		student.math = sc.nextInt();
		
		student.total = student.kor + student.eng + student.math;
		
		student.avg = student.total/(double)3;
		
		return student;
	}
	
	public Student[] addArray(Student [] students) {
		
		Student [] students2 = new Student[students.length+1];
		for(int i=0; i<students.length; i++) {
			students2[i] = students[i];
		}	
		return students2;
		
	}
	
	
}
