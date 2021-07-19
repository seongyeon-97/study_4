package com.iu.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("Ex1 start");

		Character ch1 = new Character();
		ch1.name = "루루";
		ch1.level = 30;
		ch1.hp = 100;
		ch1.mp = 200;
		ch1.gold = 2000;
		
		
		
		Weapon wp1 = new Weapon();
		wp1.name = "장검";
		wp1.damage = 20;
		wp1.critcal = 1.4;
		wp1.upgrade = 0;
		
		ch1.wp = wp1;	
//		System.out.println("보유 무기 : " + ch1.wp.name);
//		System.out.println("-----------------");
		
		// ch가 가지고 있는 무기의 이름을 변경 후 출력
		ch1.wp.name = "방패";
//		System.out.println(ch1.wp.name);
		
		wp1.name = "도끼";
//		System.out.println(ch1.wp.name);
		
//		System.out.println("무기 이름 : " + wp1.name);
//		System.out.println("공격력 : " + wp1.damage);
//		System.out.println("치명타 : " + wp1.critcal);
//		System.out.println("강화 수치 : " + wp1.upgrade);
//		System.out.println("-----------------");
		
		
		Monster mon1 = new Monster();
		mon1.name = "오크";
		mon1.level = 15;
		mon1.hp = 30;
		mon1.mp = 5;
		mon1.gold = 200;
		mon1.wp = new Weapon();
		mon1.wp.name = "둔기";
		mon1.wp.damage = 10;
		mon1.wp.critcal = 2.3;
		mon1.wp.upgrade = 3;
		
				
//		System.out.println("몬스터 이름 : " + mon1.name);
//		System.out.println("레벨 : " + mon1.level);
//		System.out.println("체력 : " + mon1.hp);
//		System.out.println("마나 : " + mon1.mp);
//		System.out.println("획득 가능 골드 : " + mon1.gold);
		
		//ch1 = monster; 타입이 달라서 에러
		ch1.gold = ch1.gold + mon1.gold; //타입이 같아서 가능
		
		//mon1 = null;
		//mon1 = new Monster();
		//System.out.println(mon1.level);
		
		ch1.wp = mon1.wp;
		
		System.out.println("캐릭터 이름 : " + ch1.name);
		System.out.println("레벨 : " + ch1.level);
		System.out.println("체력 : " + ch1.hp);
		System.out.println("마나 : " + ch1.mp);
		System.out.println("보유 골드 : " + ch1.gold);
		System.out.println("무기 이름 : " + ch1.wp.name);
		System.out.println("무기 공격력 : " + ch1.wp.damage);
		
		
		System.out.println("Ex1 start");

	}

}
