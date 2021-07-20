package com.iu.s2.ex2;

import java.util.Scanner;

public class StudentMenu {
	//메서드 선언
	//메서드명은 start
	public void start() {
		
		StudentView view = new StudentView();
		StudentInput input = new StudentInput();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요");
		int count = sc.nextInt();
		Student student = null;
		//학생을 모을 배열을 선언
		Student [] students = new Student[count];
		
		
		for(int i=0; i<students.length; i++) {				
			//Student student = input.makeStudent();
			//students[i] = student;
			students[i] = input.makeStudent();
		}
		
		boolean flag = true;
		while(flag) {
			System.out.println("1. 전체 정보 출력 " + "2. 학생 번호 검색 후 출력 " + "3. 학생 정보 추가 " + "4. 성적순으로 출력 " + "5. 프로그램 종료");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:								
				view.viewAll(students);
				break;
				
			case 2:
				System.out.print("번호를 입력해 주세요 : ");
				
				int number = sc.nextInt();
							
				for(int i =0; i<students.length; i++) {
					if(number == students[i].num) {
						student = students[i];
						break;
					}
				}
				if(student != null) {
					view.viewOne(student);
				}
				
				break;
			case 3:
				Student st = input.makeStudent();
				input.addArray();
				
				break;
			case 4:
				System.out.println("성적순으로 출력");
				break;
			default :
				System.out.println("프로그램 종료");
				flag = false;
				break;
			}
		}
	}
}
