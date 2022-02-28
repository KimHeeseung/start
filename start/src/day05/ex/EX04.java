package day05.ex;

import java.util.Scanner;

/*
	문제 4 ]
		전기요금을 계산해주는 프로그램을 작성하세요.
		
		전기요금표
			
						코드		기본요금		사용요금
			가정용		1			3800			245
			산업용		2			2400			157
			교육용		3			2900			169
			상업용		4			3200			174
			
			
		전기요금은 
			기본요금 + 사용량 * 사용요금
			
		사용자 코드와 사용량을 입력하면
		전기요금을 계산해서 출력해주는 프로그램을 작성하세요.
 */

public class EX04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자 코드 입력 : ");
		int code = sc.nextInt();
		System.out.print("사용량 입력 : ");
		int e = sc.nextInt(); // 사용량
		
		int gibon = 0; // 기본요금
		
		int use = 0; // 사용요금
		
		double wjsrl=0; //전기 사용요금
		
		switch(code){
		case 1 :
			gibon = 3800;
			use = 245;
			break;
		case 2 :
			gibon = 2400;
			use = 157;
			 break;
		case 3 :
			gibon = 2900;
			use = 167;
			 break;
		case 4 :
			gibon = 3200;
			use = 174;
			 break;
		 default:
			 break;
		}
		wjsrl = gibon + use * e;
	     System.out.println("전기요금: "+wjsrl +" 원");     
	}
}