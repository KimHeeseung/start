package day05;
import java.util.*;
public class Test2 {
	
	public static void main(String[] args) {
		//입력받을 준비
		Scanner sc = new Scanner(System.in);
		//입력메세지 출력
		System.out.print("정수 입력");
		// 입력 받아서 변수에 기억
		
		int no = sc.nextInt();
		String result = "정수";
		if(no == 0 ) {
			// no 가 0인 경우
			result = "0";
		} else {
			//no 가 0이 아닌경우
			if(no % 2 == 0) {
				//짝수인경우
				result = "짝수";
			} else {
				//홀수인경우
				result = "홀수";
			}
			
		}
		
		System.out.println("입력한 정수" + no+ "는" + result + "입니다/");
	}
}
