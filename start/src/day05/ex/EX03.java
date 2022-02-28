package day05.ex;
/*
 * 문제3

 * 문자열을 입력받아서 
 * 문자를 한글자씩 추출해서 출력하세요.
 * 
 * 참고] 
 * 	문자열의 길이를 알아내는 방법
 *		int 변수 = 문자열.length() 	
 *
 */
import java.util.*;

public class EX03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String num = sc.next();
		int snum = num.length(); 
		
		System.out.println("문자열의 길이는 : " + num.length());
		for (int i = 0; i < num.length(); i++) {
		      System.out.println( num.charAt(i) );
		    }
			
	}

}
