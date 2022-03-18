package day15;
import java.util.*;
public class Test09 {

	public Test09() {
		//ArrayList 타입의 list에 1~25사이의 정수 10개를 랜덤하게 만들어서 채워래
		
		ArrayList list = new ArrayList();
		
		for(int i = 0; i < 10; i ++) {
			list.add((int)(Math.random()*25+1));
			
		}
		//출력
		System.out.print("1.정렬 전  : ");
		for(int i = 0 ; i < list.size(); i++) {
			
			System.out.print((int)(list.get(i)) + " | ");
		}
	}
	public static void main(String args[]) {
		new Test09();
	}
	
}
