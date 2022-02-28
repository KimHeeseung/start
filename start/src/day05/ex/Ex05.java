package day05.ex;

/*
	문제 5 ]
		컴퓨터와 사용자 사이의 가위바위보 게임을 한다.
		
		컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생하여
		가위, 바위, 보로 가정하고
		사용자는 키보드를 이용해서 1 ~ 3 사이의 숫자를 입력하도록 한다.
		
		누가 이겼는지를 확인하는 프로그램을 작성하세요.
		
 */
import java.util.*;
public class Ex05 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1.가위 2.바위 3.보 ");
        System.out.print("숫자을 입력하세요 :");
        int com = 0;
        int user = sc.nextInt();
        Random r =new Random();

        com = r.nextInt(3)+1;   
        
        System.out.println("유저 : "+user);
        System.out.println("컴퓨터 : "+com);
        
        if(user == 1) {
               if(com == 2) {
                      System.out.println("승리");
               }
               else if(com == 3) {
                      System.out.println("패배");
               }
               else {
                      System.out.println("무승부");
               }
        }
        else if(user == 2) {
               if(com == 2) {
                      System.out.println("무승부");
               }
               else if(com == 3) {
                      System.out.println("승리");
               }
               else {
                      System.out.println("패배");
               }
        }
        else if(user == 3) {
               if(com == 2) {
                      System.out.println("패배");
               }
               else if(com == 3) {
                      System.out.println("무승부");
               }
               else {
                      System.out.println("승리");
               }
        }
  }
}