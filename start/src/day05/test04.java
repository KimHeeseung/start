package day05;
/*
 * 	나이를 입력받아서
 * 	유년기
 * 	10
 * 	20
 * 	30
 * 	40
 * 	장년층으로 구분해서 출력하세요.
 */



import java.util.*;
public class test04 {
	
	public static void main(String[] args) {
		
		//1. 입력도구 준비
		Scanner sc = new Scanner(System.in);
		//2.메세지출력
		System.out.print("나이 입력 : ");
		//3. 입력받아 변수에 기억시키고
		int age = sc.nextInt();
		//4.판별해서 결과 기억
		
		//결과 변수 만들기
		String sage = "장년층";
		
		if(age < 10) {
			sage = "유년기";
		
		}else if (age < 20 ) {
			sage = "10대";
		}else if(age < 30){
			sage = "20대";
		}else if(age < 40){
			sage = "30대";
		}else if(age < 50){
			sage = "40대";
		}else {
			sage = "장년층";
	}

		System.out.println("입력나이 :" +age + " 는 " + sage + " 입니다.");
	}
}