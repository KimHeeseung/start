package day07;

import java.util.Arrays;

public class Test05 {

	public static void main(String args[]) {
		//할일
		
		//배열만들고
		int[] subj = new int[6];
		//맨 마지막방에는 총점이 계산되어야 하므로 그 이전방까지 접근해서 입력한다.
		for(int i = 0; i < subj.length - 1; i++) {
			//과목점수 만들고 입력
			int score = (int)(Math.random() * 41 + 60 ); // 41 <== 100 - 60 + 1
			subj[i] = score;
		}
		System.out.println(Arrays.toString(subj));
		
				
		//3총점 계산입력
		for(int i = 0; i < subj.length -1; i++) {
			subj[5] += subj[i];
			
		}
		System.out.println("2. " + Arrays.toString(subj));
		//4평균 구해서 기억
		int no = subj.length - 1 ;
		double avg = subj[5] / (double) no;
		//5데이터 출력
		//과목 점수 출력
		System.out.print("과목 점수 : ");
		for(int i = 0; i < subj.length -1; i++) {
			System.out.print(subj[i] + " | ");
		}
		//총점
		System.out.println();
		System.out.println("총		점 :" +subj[subj.length - 1]);
		//평균
		System.out.println("평		균 :" +avg);
	}
}
