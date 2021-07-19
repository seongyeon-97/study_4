package com.iu.ex1;

public class Ex1Main2 {

	public static void main(String[] args) {
		System.out.println("Main2 start");
		
		Pet pet1 = new Pet();
		pet1.name = "강아지";
		Pet pet2 = new Pet();
		pet2.name = "고양이";
		
//		Character ch2 = new Character();
//		ch2.p1 = pet1;
//		ch2.p2 = pet2;
//		
//		System.out.println(ch2.p1.name);
//		System.out.println(ch2.p2.name);
		
		//배열을 사용해보자
		Pet [] pets = new Pet[2];
		pets[0] = pet1;
		pets[1] = pet2;
		//System.out.println(pets[0].name);
		
		for(int i=0; i<pets.length; i++) {
			System.out.println(pets[i].name);
		}
		
		
		System.out.println("Main2 finish");		
	}

}
