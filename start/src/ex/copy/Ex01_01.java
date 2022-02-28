package ex.copy;
/*
 * 문제 1 - 1 ]
		1  ~ 25 의 숫자 3개를 랜덤하게 발생시켜서
		그수들중 가장 큰 수, 중간수, 작은수를 구분해서 출력하는 프로그램을 작성하세요.
		
		단, 3항 연산자를 사용해서 처리하세요.
 */

import java.util.Scanner;

public class Ex01_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no1 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int no2 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int no3 = (int)(Math.random() * (25 - 1 + 1) + 1);
		
		
		int max = (no1 > no2) ? ( //no1 > no2 라는 전제 하에 실행
					no1 > no3 ? no1 : no3
				) : ( // no2 > no1 라는 전제하에 실행
					(no2 > no3) ? no2 : no3	
				);
					//작은수
		int jak = (no1 < no2) ? (
					no1 < no3 ? no1 : no3
				) : (
						(no2 < no3) ? no2 : no3
				);
					//중간수
		int mid = (no1 > no2) ?  (
					no1 > no3 ? no2 : no3		
				) : (
					 (no2 > no3) ? no1 : no2
				);
				

	
		System.out.println("랜덤한 3개중 가장 큰 숫자는 : " + no1 + ", " + no2 + "," +no3+
				"중에 제일 \n큰수 "  + max + "\n중간수" + mid + "\n작은수 " + jak);
		
		
		/*
		 * 문자열을 표현할 때 문자열 안에 기호를 출력하는 방법
		 * ==>  
		 *
		 * 
		 */
		
	}
}