package day03.ex;

import java.util.*;

/*
 * 	84232원을 지불할려고 한다.
 * 	우리나라 화폐단위로 이금액을 지불하려면 
 * 	각 단위가 몇개씩 필요한지 계산해서 출력하세요.
 
  	화페단위
  		50000
  		10000
  		5000
  		1000
  		500
  		100
  		50
  		10
  		
  
 * 
 */

public class ex03 {
	public static void main(String[] args) {
		int total = 84232;
		
		int tmp = total;
		
		//5만원 권
		int oman = tmp / 50000;
		// 5만원권 제외한 금액 기억
		tmp = tmp % 50000;
		
		//5만원 권
		int aks = tmp / 10000;
		// 5만원권 제외한 금액 기억
		tmp = tmp % 10000;
		
		//5만원 권
		int dhcjs = tmp / 5000;
		// 5만원권 제외한 금액 기억
		tmp = tmp % 5000;
		
		//5만원 권
		int cjs = tmp / 1000;
		// 5만원권 제외한 금액 기억
		tmp = tmp % 1000;
		
		//5만원 권
		int dhqor = tmp / 500;
		// 5만원권 제외한 금액 기억
		tmp = tmp % 500;
		
		//5만원 권
		int qor = tmp / 100;
		// 5만원권 제외한 금액 기억
		tmp = tmp % 100;
		
		int dhtlq = tmp / 50;
		// 5만원권 제외한 금액 기억
		tmp = tmp % 50;
		
		int tlq = tmp / 10;
		// 5만원권 제외한 금액 기억
		
		
		System.out.println(" 총금액 " + total + "원은");
		System.out.println(" 오만원권 " + oman + "장");
		
		System.out.println(" 총금액 " + total + "원은");
		System.out.println(" 만원권 " + aks + "장");
		
		System.out.println(" 총금액 " + total + "원은");
		System.out.println(" 오천원권 " + dhcjs + "장");
		
		System.out.println(" 총금액 " + total + "원은");
		System.out.println(" 천원권 " + cjs + "장");
		
		System.out.println(" 총금액 " + total + "원은");
		System.out.println(" 오백원권 " + dhqor + "장");
		
		System.out.println(" 총금액 " + total + "원은");
		System.out.println(" 백원권 " + qor + "장");
		
		System.out.println(" 총금액 " + total + "원은");
		System.out.println(" 오십원권 " + dhtlq + "장");
		
		System.out.println(" 총금액 " + total + "원은");
		System.out.println(" 십원권 " + tlq + "장");
		
				
		
	}

}
