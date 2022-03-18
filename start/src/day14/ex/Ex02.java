package day14.ex;

import day14.Nemo;
import day14.Test02;

/*
 	문제 2 ]
 		사각형의 정보를 기억하는 클래스 Nemo를 제작하세요.
 		필요한 변수와 함수, 생성자는 필요한만큼 추가하고
 		단, 가로와 세로가 동시에 같은 사각형만 같은 사각형으로 처리가 되도록
 		equals() 함수를 오버라이드 하세요.
 		이 클래스 객체를 출력하면 내용이 출력되도록 toString 함수를 오버라이드 하세요.
 */

public class Ex02 {

	public Ex02() {
		int no1 =(int)(Math.random()*100+1);
		int no2 =(int)(Math.random()*100+1);
		int no3 =(int)(Math.random()*100+1);
		int no4 =(int)(Math.random()*100+1);
		
		Nemo n1 = new Nemo(no1,no2);
		Nemo n2 = new Nemo(no3,no4);
	
	//결과값 변수
	String result = (n1.equals(n2)) ? "같은 " : "다른 ";
	//출력
	System.out.println("n1 과 n2 네모는 " + result + "네모입니다");
	System.out.println("n1 : " + n1);
	System.out.println("n2 : " + n2);
	System.out.println("n1 == n2 : " + (n1 == n2));
}
public static void main(String args[]) {
	new Ex02();
}
}
