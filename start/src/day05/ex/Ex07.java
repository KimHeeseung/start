package day05.ex;

/*
	문제 7 ]
		5자리의 숫자를 입력한 후
		각자리의 수의 합을 구하는 프로그램을 작성하세요.
 */
import java.util.*;
public class Ex07 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("5자리의 숫자 : ");
		int num = sc.nextInt();
		int hap = 0;
		
		while (num > 0) {

			hap += num % 10;

			num /= 10;
				
		}
		System.out.println("각자리의 숫자의 합은 : " + hap);
	}
}