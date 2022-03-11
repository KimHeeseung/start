package day08.ex;
import java.util.*;
/*
 * 7학생의 5과목 점수를 랜덤하게 만들어서 기억시키고
 * 각 학생 배열의 맨 마지막에는 총점을 계산에서 입력되게 하고
 * 결과 출력하는데
 * 평균도 계산해서 출력하세요.
 */

public class Ex01 {

public static void main(String[] args) {
		int[][] stud = new int [7][6]; //7명의 학생의 6과목 점수배열
		int cnt = 0;
		//과목 점수 입력
		for(int i = 0; i < stud.length; i++) {
			//학생 선택된 상태
			for(int j = 0 ; j < stud[i].length; j++) {
				//선택된 학생의 과목을 선택한 상태
				
				//괌고 점수를 랜덤하게 입력
				stud[i][j] = (int)(Math.random()*41+60);
			}
		}
		//출력
		System.out.println("1 |" + "2 |" + "3 |" + "4 |" + "5 |" + "6 |" + "7 |");
		System.out.println("------------------------");
		
		for(int i = 0; i < stud.length; i++) { //학생 선택 반복문
			for(int j = 0; j < stud[i].length; j++) { //선택된 학생의 과목을 선택 반복문
				System.out.print(stud[i][j] + "|");
			}
			System.out.println();
		}
	
		//총점구하기
		
		//총점을 관리할 배열
		int[] total = new int[7];
		double[] avg = new double[7];
		for(int i = 0; i < stud.length; i++) {
			for(int j = 0; j < stud[i].length; j++) {
				total[i] += stud[i][j];
			}
			
		}
		//출력 ;
		for(int t : total){
			for(int i = 0; i < stud.length; i++) {
				avg[i] = total[i] / stud.length;
		}

		
		for(double a : avg) {
			for(int i = 0; i < total.length; i++) {
			}
		}
			double a = t /stud.length;
			
			System.out.println("평균 : " + a);
			System.out.println("총점 : " + t);	
			System.out.println("-------------------------" );
			
		}
		
		}
	}