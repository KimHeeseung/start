package ex.copy;

/*
 * 
 * 문제 2
 * 		문자를 임의로 랜덤하게 입력한 후 
 * 		그 문자가 대문자이면 소문자로 
 * 		소문자이면 대문자로 변환하고
 * 		만약 특수문자이면 그문자 그대로 출력하는 프로그램을 작석
 * 
 * 참고 
 * 문자열에서 문자를 추출하는 방법
 * 문자열.charAT(위치값)
 *이때 위치값은 0부터 시작
 *예]
 *abcd 에서 두번째 문자를 추출하려면
 *abcd.char(1) ==> b 
 *
 *
 */
import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
		//할일
		//입력도구 준비
		Scanner sc = new Scanner(System.in); 
		//메세지 출력하고
		System.out.print("문자 입력 : ");
		//입렵받아 문자열 저장
		String str = sc.nextLine();
		//문자열에서 문자 추출
		char ch = str.charAt(0);
		
		//판별하고  (판별결과는 변수에 담아서 처리하자)
		char result = (ch < 'A') ? (ch) : (
					(ch <= 'Z') ? ((char)(ch  +  ('a' - 'A' ))) : 
						(ch < 'a') ? (ch) : (
								(ch <= 'z') ? (char)(ch - ('a' - 'A')) : ch
								) 
				);
		
		// 결과 출력
		System.out.println("입력한 문자 : " + ch);
		System.out.println("변환된 문자 : " + result);
	}

}
