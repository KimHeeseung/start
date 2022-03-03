package day07;

public class Test02 {
	public static void main(String args[]) {
		//배열의 주소를 기억할 변수
		int[] lotto;
		//배열을 만들고
		lotto = new int[6];
		
		int len = lotto.length;
		
		loop:
		for(int i = 0; i < len ; i++) {
			//랜덤하게 정수를 만들어서
			int no = (int)(Math.random()*45 +1);
			
			//중복검사
			//지금 만든 번호가 이전에 이미 만들어진 번호면
			//지금 회차를 반복한다.
			for(int j = 0; j < i; j++) {
				//이전에 만든 번호 추출
				int tmp = lotto[j];
				
				if(no == tmp) {
					
					//이경우는 지금 만든 번호가 이전회에서 이미 만든 번호이므로
					//지금 회차를 다시 반복한다.
					
					//회차를 1감소 시켜준다.
					i--;
					
					continue loop;
					
				}
			}
			
			lotto[i] = no;
		}
			for(int i = 0; i < len; i++) {
			System.out.print(lotto[i] + " | ");
		}
		System.out.println();
	}

}
