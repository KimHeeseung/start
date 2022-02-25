package ex;
/*
 * 문제1 ] 
 * 		숫자 3개를 랜덤하게 발생시켜 
 * 		그 수들중 가장 큰 수만 출력하는 프로그램을 작성
 * 		단 , 3항 연산자를 사용해서 처리하세요.
 */

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no1 = (int)(Math.random() * (100 - 1 + 1) + 1);
		int no2 = (int)(Math.random() * (100 - 1 + 1) + 1);
		int no3 = (int)(Math.random() * (100 - 1 + 1) + 1);
		int no4;
		
		
		if (no1 >= no2 && no1 >= no3) {
            no4 = no1;
        } else if (no2 >= no1 && no2 >= no3) {
            no4 = no2;
        } else {
        	 no4 = no3;
        }
        
	
		System.out.println("랜덤한 3개중 가장 큰 숫자는 : " + no4 + "입니다.");

		
	}
}