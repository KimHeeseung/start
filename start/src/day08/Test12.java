package day08;

public class Test12 {
	public static void main(String[] args) {
			int[][] munja = new int[10][2]; // 문자 열개의 데이터 2개를 관리할 배열
				
		/*문자를 입력
		munja[0][0] = 'A';
		munja[1][0] = 'B';
		munja[2][0] = 'C';
		*/
			for(int i=0; i < munja.length; i++) {
			munja[i][0] = 'A' + i;
			}
		
		// 랜덤하게 문자를 100번 발생시켜서 카운트를 올려준다.
		
		/*
		 *	char ch = 'A'
		 *	'A' ==> munja[ch - 'A'] 
		 *
		 */
			for(int i = 0; i < 100; i++) {
				char ch = (char)(Math.random() * ('J' - 'A' +1) +'A');
			
				int idx = ch - 'A';
				munja[idx][1] += 1;
			/*
			int oldCount = munja[idx][1];
			int newCount = oldCount +1;
			
			munja[idx][1] = newCount;
			*/
		}
			for(int i = 0; i < munja.length; i++) {
			
				int[] arr =munja[i];
				char ch = (char) arr[0]; //문자의 아스키 코드값을 꺼내서 문자로 강제 형변환
				int count = arr[1]; // 카운트
			
			// 타이트 출력
					System.out.print(ch + " : " + count + " : " );
				for(int j = 0; j < count; j++) {
					System.out.print("* ");	
			}
					System.out.println();
		}
	}

}
