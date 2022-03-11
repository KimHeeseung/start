package day07.ex;

import java.util.Arrays;

/*
 * 	5명의 학생의 이름을 기억할 배열을 만들고
 * 	각 학생의 시험 성적을 기억할 배열을 만들어서
 * 	결과를 출력하는 프로그램을 작성하세요.
 * 
 * 	출력예 ] 
 * 
 * 		둘리 : 80
 * 		제니 : 90
 * 		리사 : 80
 * 		로제 : 75
 * 		지수 : 100
 * 		--------------
 * 		총점 : 000
 * 		평균 : 00.00 
 */

public class Ex04 {
public static void main(String args[]) {
	int num[] =  new int[5];
	
	//출력 내용확인용
	

		for(int i = 0; i < num.length; i++)
		{
			int count = num[i];
			
			int score = num[i];
			//총점에 과목점수를 누적
			
			num[0] = (int)(Math.random()* 41 + 60);
			num[1] = (int)(Math.random()* 41 + 60);
			num[2] = (int)(Math.random()* 41 + 60);
			num[3] = (int)(Math.random()* 41 + 60);
			num[4] = (int)(Math.random()* 41 + 60);		
	}
		String[] blackpink = new String[5];
		for(int i = 0; i < blackpink.length; i++){
			int count = num[i];
			blackpink[0] = "둘리";
			blackpink[1] = "제니";
			blackpink[2] = "로사";
			blackpink[3] = "로제";
			blackpink[4] = "지수";
			
			System.out.println(blackpink[i] +" : " + num[i]);
			
		}
		System.out.println("-----------");
		int total = 0;
		for(int i = 0 ; i < num.length; i++) {
			int score = num[i];
			//총점에 과목점수를 누적
			total = total + score;
		}
		double avg = total / (double)(num.length);
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " +avg);
	}
}