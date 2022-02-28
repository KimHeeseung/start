package day05;
import java.util.*;
public class Test01 {
	
	public static void main(String[] args) {
		//입력받을 준비
		Scanner sc = new Scanner(System.in);
		//입력메세지 출력
		System.out.print("정수 입력");
		// 입력 받아서 변수에 기억
		
		int no = sc.nextInt();
		
		//판별
		
		String result = "정수";
		
		if (no == 0) {
			result = "0";
		}
		/*
		if(no != 0 && no %2 == 0) {
			result = "짝수";
			//짝수인경우
		}
		if (no !=0 && no %2 != 0) {
			result = "홀수";
		}
		*/
		if(no !=0) {
			if(no % 2 == 0)
				result = "짝수";
		}
		if(no %2 == 1) {
			result = "홀수";
			
		}
	}
}
