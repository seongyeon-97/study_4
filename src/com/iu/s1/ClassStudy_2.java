package com.iu.s1;

import java.util.Scanner;

public class ClassStudy_2 {
	public static void main(String[] args) {
		System.out.println("----Study start----");
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("학생 수를 입력하세요");
		int count = sc.nextInt();
		
		//학생을 모을 배열을 선언
		Student [] students = new Student[count];
				
		for(int i=0; i<students.length; i++) {
			Student student = new Student();
			
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
			
			students[i] = student;
		}
		
		
		
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
			System.out.println("----------------------------------------------------");
		}
		System.out.println("----Study finish----");		
	}
}
