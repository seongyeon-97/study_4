package com.iu.s1;

public class ClassStudy_1 {

	public static void main(String[] args) {
		//main mathod의 용도는 프로그램을 시작하는 용도
		//또는 mathod 테스트 용도
		
		System.out.println("Study1 start");
		
		//학생 1명 생성
		//클래스명 변수명 = new 클래스명();
		//데이터타입 변수명;
		
	    Student st = new Student();
	    
	    Student st2 = new Student();
	    
	    //멤버의 접근(사용)
	    //참조변수명	    
	    
	    st.name="iu"; //st의 name이니까 String타입
	    st.num = 1;
	    st.kor = 86;
	    st.eng = 90;
	    st.math = 78;
	    st.total = st.kor + st.eng + st.math;
	    //st의 총점을 계산해서 입력하고 출력
	    st.avg = st.total/3.0;
	    
	    System.out.println("이름 : " + st.name);
	    System.out.println("번호 : " + st.num);
	    System.out.println("국어점수 : " + st.kor);
	    System.out.println("영어점수 : " + st.eng);
	    System.out.println("수학점수 : " + st.math);
	    System.out.println("총점 : " + st.total);
	    System.out.println("평균 : " + st.avg);
	    
	    st2.num = 1;
	    System.out.println(st.num == st2.num); //true
	    
//	    System.out.println(st2);
//	    System.out.println(st == st2);
		System.out.println("Study1 start");
	}

}
