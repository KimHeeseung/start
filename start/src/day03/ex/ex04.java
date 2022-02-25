package day03.ex;

import java.util.Scanner;

/*
 * 	1년은 365.2426 일이다
 * 	이것은 과연 몇일 몇시간 몇분 몇초인지를 계산하고 출력하세요.
 */

public class ex04 {
	public static void main(String[] args) {
		//할일
		//데이터 변수에 기억
		double total = 365.2426;
		//누적계산될 변수 만들고
		double tmp = total;
		//날수 구하고 --> 누석 변수에 계산해서 업데이트
		int day = (int) tmp;
		tmp = tmp -day;
		//tmp -= day;
		
		// 0.2426을 초로 변환한다.
		// 1 * 24 => 하루의 시간
		// 0.5 * 24 ==> 반나절의 시간
		// 0.1 * 24 ==> 0.1일의 시간
		int tsec = (int) (0.2426 * 24 * 60 * 60); 
		// 시간을 구하고 누적변수에 계산해서 업데이트
		int hour = tsec / 60 / 60 ;
		
		tsec = tsec % 3600;
		
		//분을 구하고 누적변수에 계산해서 업데이트
		int min = tsec / 60;
		tsec = tsec % 60;
		//초
		int sec = tsec;
		//출력
		System.out.println(" 1 년은 " + total + "일이고");
		System.out.println(" 이것은 " + day + "일");
		System.out.println(" 이것은 " + hour + "시간");
		System.out.println(" 이것은 " + min + "분");
		System.out.println(" 이것은 " + tsec + "초 이다");
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		double total = 365.2426;
		
		System.out.println(" 몇일 : " +(total) + "일" );
		
		double tlrks = total * 24;
		System.out.println(" 시간 : " + Math.round(tlrks) + "시간 ");
		
		double qns = tlrks * 1440;
		System.out.println(" 분 : " +Math.round(qns) + "분" );
		
		double ch = qns * 86400;
		System.out.println(" 초 : " +Math.round(ch) + "초" );
*/
	}

}
