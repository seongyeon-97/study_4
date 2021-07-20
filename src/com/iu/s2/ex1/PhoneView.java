package com.iu.s2.ex1;

public class PhoneView {
	
	public void view(Phone phone) {
		//phone의 정보를 출력하는 메서드
		System.out.println(phone.make);
		System.out.println(phone.brand);
		System.out.println(phone.color);
		System.out.println(phone.size);
		System.out.println(phone.price);
	}
	
	public void pricehap(Phone [] phones) {
		int sum=0;
		
		for(int i=0; i<phones.length; i++) {
			sum = sum + phones[i].price;
		}
		System.out.println("총 가격 : " + sum);
	}
}
