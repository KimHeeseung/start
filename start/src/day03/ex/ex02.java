package day03.ex;
import java.util.*; 
/*
 *	문제 2 ] 
 *		하나의 숫자를 입력반은 후 (원의 반지름)
 *		그 숫자를 이용해서 원의 넓이와 둘레의 계산하고 출력하세요.
 *
 * 	참고] 
 * 		원의 넓이 : 반지름 * 반지름 * 3.14
 * 		원의 둘레 : 2 * 반지름 * 3.14
 *
 * 
 * 
 * 
 */
public class ex02 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double radius;
			System.out.print("원의 반지름");
			radius = sc.nextDouble();
			System.out.print("원의 둘레 : " + ( 2 * 3.14 * radius));
			System.out.print("원의 넓이 : " + ( 3.14 * radius * radius));	
	}

}
