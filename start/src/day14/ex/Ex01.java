package day14.ex;

import day14.Nemo;
import day14.Test02;

/*
 	문제 1 ]
 		원의 정보를 기억할 클래스를 제작하세요.
 		가지는 정보는
 			반지름,면적,둘레 radius,Area,circle
 		를 가지고 
 		기능은 변수에 접근할 수 있는 함수를
 		그리고 반지름이 같이면 같은 원으로 처리해주는 기능의
 			equlas()
 		함수로 오버라이드 하고
 		이클래스 타입의 변수를 출력하면 해당 원의 정보를 출력해주는 함수도 오버라이드 해주세요.
 */

public class Ex01 {

	public Ex01() {
		int no1 = (int)(Math.random()*100+1);
		int no2 = (int)(Math.random()*100+1);
		won w1 = new won(no1);
		won w2 = new won(no2);
		
		
		//결과값 변수
				String result = (w1.equals(w2)) ? "같은 " : "다른";
				//출력
				System.out.println("랜덤한 원의 반지름 : " + no1 + "입니다");
				System.out.println("랜덤한 2번째 원의 반지름 : " + no2 + "입니다");
				
				System.out.println("n1 과 n2의 원은 " + result + "원입니다");
				
				System.out.println("w1 : " + w1);
				System.out.println("w2 : " + w2);
				System.out.println("w1 == w2 : " + (w1 == w2));
		}
			public static void main(String args[]) {
				new Ex01();
		}
}