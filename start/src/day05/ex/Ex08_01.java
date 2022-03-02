package day05.ex;

/*
	문제 08_01 ]
		1바이트로 기억되는 2진수를 랜덤하게 만들어
		그숫자가 10진수로 몇인지출력하는 프로그램을 작성하세요.
		
		참고 ]
			문자열 2진수를 10진수 정수로 변환해주는 방법
				
				Integer.valueOf("문자열 2진수", 2);
				Integer.parseInt("문자열 2진수", 2);
		
		힌트 ]
			이진수 는 0과 1을 랜덤하게 발생시켜서 문자열에 덧붙여서 만든다.
 */
public class Ex08_01 {

	public static void main(String[] args) {
		String bno = "";
		
		for(int i = 0; i < 8 ; i++) {
			int no = (int)(Math.random() *2);
			
			
			//이진수 변수에 덧붙인다.
			bno = no + bno;
		}
		int num = Integer.valueOf(bno,2);
		
		System.out.println("랜덤하게 만들어진 이진수 : " + bno);
		System.out.println("십진수로 변환한 이진수 : " + num);
		
	}

}