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
		
		int no1 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int no2 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int no3 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int no4;
		
		System.out.println("no1 는 : " + no1);
		System.out.println("no2 는 : " + no2);
		System.out.println("no3 는 : " + no3);
		
		
		int max = (no1 > no2) ? ( //no1 > no2 라는 전제 하에 실행
					no1 > no3 ? no1 : no3
				) : ( // no2 > no1 라는 전제하에 실행
					(no2 > no3) ? no2 : no3	
				);
		
		//if문
		/*
		if (no1 >= no2 && no1 >= no3) {
            no4 = no1;
        } else if (no2 >= no1 && no2 >= no3) {
            no4 = no2;
        } else {
        	 no4 = no3;
        }
        */
	
		System.out.println("랜덤한 3개중 가장 큰 숫자는 : " + no1 + ", " + no2 + "," +no3+ "중에 제일 큰수는 \n"  + max + "입니다.");
		
		
		/*
		 * 문자열을 표현할 때 문자열 안에 기호를 출력하는 방법
		 * ==>  
		 *
		 * 
		 */
		
	}
}