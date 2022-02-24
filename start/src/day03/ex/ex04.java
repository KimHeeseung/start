package day03.ex;

import java.util.Scanner;

/*
 * 	1년은 365.2426 일이다
 * 	이것은 과연 몇일 몇시간 몇분 몇초인지를 계산하고 출력하세요.
 */

public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 365.2426;
		
		System.out.println(" 몇일 : " +(total) + "일" );
		
		double tlrks = total * 24;
		System.out.println(" 시간 : " + Math.round(tlrks) + "시간 ");
		
		double qns = tlrks * 1440;
		System.out.println(" 분 : " +Math.round(qns) + "분" );
		
		double ch = qns * 86400;
		System.out.println(" 초 : " +Math.round(ch) + "초" );
	}

}
