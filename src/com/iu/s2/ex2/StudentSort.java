package com.iu.s2.ex2;

public class StudentSort {
	
	public Student [] sortByAge(Student [] students) {
		Student [] copy = new Student[students.length];
		for (int i=0; i<students.length; i++) {
			copy[i] = students[i];
		}
		for(int i=0; i<copy.length-1;i++) {
			for(int j=i+1; j<copy.length; j++) {
				if(copy[i].avg < copy[j].avg) {
					
					Student tmp = copy[j];
					copy[j] = copy[i];
					copy[i] = tmp;
					
				}
			}
		}
		return copy;
	}
	
}
