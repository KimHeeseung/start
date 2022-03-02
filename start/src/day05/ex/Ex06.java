package day05.ex;

import java.util.Random;
import java.util.Scanner;

/*
	문제 6 ]
		랜덤하게 정수를 컴퓨터가 만들어 내면
		그 수를 알아맞추는 게임을 만드세요.
		
		예 ]
			
			발생숫자 : 54
			
			사용자입력숫자 : 45
			
			==> "입력한 수가 더 작습니다."
			로 메세지 를 출력해서 사용자가 숫자를 알아맞추는 게임...
			
			횟수도 같이 출력되게 하세요.
 */
public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com = 0;   
		int user = 0;	
        int count = 0;
        
        while(true) { 
			count++; 
			System.out.print("사용자 입력 숫자 :");
			user = sc.nextInt(); 
			Random r =new Random();
			com = r.nextInt(100)+1;
			
			
			if(com == user){

				System.out.println("맞췄습니다.");
				System.out.println("발생 숫자 : " + com);
				System.out.println("시도횟수는 "+count+"번입니다.");
				break;

			}else if(com > user){

				System.out.println("더 큰 수를 입력하세요.");
				System.out.println("발생 숫자 : " + com);
				System.out.println("시도횟수는 "+count+"번입니다.");
			}else if(com < user){

				System.out.println("더 작은 수를 입력하세요.");
				System.out.println("발생 숫자 : " + com);
				System.out.println("시도횟수는 "+count+"번입니다.");
			}
			if(count == 5 ) {
				System.out.println("시스템에게 패배 했습니다.");
				break ;
			}
			
			
				
        }
		
		
	}

}