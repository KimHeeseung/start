package day05;

public class Test09 {
	
	
	/*
	 * for 명령문에 증감식 조건식 
	 */
	public static void main(String[] args) {
		for(int i = 0 ; i < 100; i++) {
			/*
			 * 참고 
			 * for 명령에서 조건식에 아무것도 기술하지 않는 경우
			 * 조건식의 결과를 true로 실행하게 된다.
			 */
			
			int no = i + 1;
			if(no > 50) {
				break;
			}
			System.out.print(no + ",");
		}
		System.out.println();
		
		int no = 1;
		while(true) {
			/*
			 
			if(no > 50) {
				break;
			}
			/*
			 * 참고 블럭의 내용이 하나만 기술되는 경우는
			 * 블럭기호 ({}) 를 생략할수 있다.
			 * 
			 
			 */
			if (no > 50) break;
			//증감식
			System.out.print(no + ",");
			++no;
			
		}
		System.out.println();
	}

}
