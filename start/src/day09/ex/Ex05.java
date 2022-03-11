package day09.ex;

import java.util.Arrays;

import day09.ex.Ex05;

/*
	문제 5 ]
		10 학생의 국어, 영어, 수학 점수를 랜덤하게 입력받아서
		총점과 석차를 구하는 프로그램을 작성하세요.
		
		각 학생의 점수입력, 총점계산, 석차계산, 출력은 함수로 처리하세요.
		
 */
public class Ex05 {
	public Ex05() {
		 int[][] stud = new int[10][5];
	        setArr(stud);
	        
	        for(int i = 0 ; i < stud.length ; i++ ) {
	            int[] no = stud[i];
	            setTotal(no);
	        }
	        ranking(stud);
	        //내용출력
	        System.out.println(" 국어|"+" 영어 |"+" 수학 |"+" 총점 |"+" 순위 |");
	        System.out.println(" ---------------------------------");

	        toPrint(stud);
	    }

	  public static void main(String[] args) {
	        new Ex05();

	}
	  // 배열을 입력해서 실행하면 점수를 채워주는 함수
	    public void setArr(int[][] score) {
	        for(int i = 0 ; i < score.length; i++ ) {

	            for(int j = 0 ; j < score[i].length; j++ ) {
	                score[i][j] = (int)(Math.random() * 41 + 60);
	            }
	        }
	    }

	// 한 학생의 점수 배열을 입력하면 총점을 계산해서 셋팅해주는 함수
	    // 한 학생의 점수 배열을 입력하면 총점을 계산해서 셋팅해주는 함수
	    public void setTotal(int[] score) {
	        int sum = 0 ;
	        for(int i = 0 ; i < score.length-2 ; i++ ) {
	            sum += score[i];
	        }
	        score[score.length-2] = sum;
	    }

	//arr[i][4]에 순위 넣기

	    public int ranking(int[][] arr) {
		int rank = 1;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i][4] = 1;
			for(int j = 0; j < arr.length; j++) {
				
				if(arr[i][3] < arr[j][3]) {
					arr[i][4] += 1;
				}
			}
		}
		return rank;
	}
	// 출력하는 함수
	public void toPrint(int[][] arr) {
		for(int i = 0 ; i < arr.length ; i++ ) {
			for(int j = 0 ; j < arr[i].length ; j++ ) {
				System.out.printf("%3d | ", (arr[i][j]));	
				
			}		
			System.out.println();
		}
		
	}
}