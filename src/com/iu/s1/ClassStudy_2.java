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
		Student student = null;
		for(int i=0; i<students.length; i++) {
			student = new Student();
			
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
		
		//1. 전체 정보 출력 2. 학생 번호 검색 후 출력(없으면 학생이 없다) 3. 학생 정보 추가 - 학생 한명을 배열에 추가
		//4. 성적 순서 출력 5. 프로그램 종료
		
		boolean flag = true;
		int i =0;
		while(flag) {
			System.out.println("1. 전체 정보 출력" + "2. 학생 번호 검색 후 출력" + "3. 학생 정보 추가" + "4. 성적순으로 출력" + "5. 프로그램 종료");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
				System.out.println("=======================================================");
				
				for(i =0; i<students.length; i++) {
					System.out.print(students[i].name+"\t");
					System.out.print(students[i].num+"\t");
					System.out.print(students[i].kor+"\t");
					System.out.print(students[i].eng+"\t");
					System.out.print(students[i].math+"\t");
					System.out.print(students[i].total+"\t");
					System.out.println(students[i].avg);
					System.out.println("----------------------------------------------------");
				}
				break;
				
			case 2:
				System.out.print("번호를 입력해 주세요 : ");
				int number = sc.nextInt();
				for(i =0; i<students.length; i++) {
				if(number == students[i].num) {
					System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
					System.out.println("=======================================================");
					System.out.print(students[i].name+"\t");
					System.out.print(students[i].num+"\t");
					System.out.print(students[i].kor+"\t");
					System.out.print(students[i].eng+"\t");
					System.out.print(students[i].math+"\t");
					System.out.print(students[i].total+"\t");
					System.out.println(students[i].avg);
					System.out.println("----------------------------------------------------");
				}else {
					System.out.println("없는 번호 입니다. 다시 입력해주세요.");
					break;
				}
				}
				break;
				
			case 3:
				System.out.println("학생 정보를 추가해 주세요");
				Student [] students2 = new Student[students.length+1];
				for(i=0; i<students2.length; i++) {
					student = new Student();
					
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
					
					students2[i] = student;
					
					for(i=0; i<students.length; i++) {
						students2[i]=students[i];
						}				
					students = students2;
					break;
				}
			}
		}
		
		
		
		
		System.out.println("----Study finish----");		
	}
}
