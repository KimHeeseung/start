package day07;

import java.util.Arrays;

public class Test04 {
	public static void main(String args[]) {
		
		int[] subj = new int[5];
		
		for(int i = 0 ; i < subj.length; i ++) {
			//랜덤하게 만든 점수를 각 과목방에 입력한다.
			
			/*
			 
			 *int score = (int)(Math.random() * (100-60+1) +60); 
			 같다 두개가
			 * subj[i] = score;
			 */
			
			
			
			subj[i] = (int)(Math.random() * (100-60+1) +60); //60~ 100사이의 정수
		}
		//총점 계산
		int total = 0;
		for(int i = 0 ; i < subj.length; i++) {
			int score = subj[i];
			//총점에 과목점수를 누적
			total = total + score;
		}
		//평균을 구한다.
		double avg = total / (double)(subj.length);
		//출력
		System.out.println("각 과목 점수 : " + Arrays.toString(subj));
		System.out.println("각 과목 총 점수 : " + total);
		System.out.println("각 과목 점수 : " + avg);
		
	}

}
