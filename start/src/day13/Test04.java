package day13;

public class Test04 {
	
	public Test04() {
		int no = 25;
		int result = 0;
		
		for(int i = -3; i <= 3; i++ ) {
			try {
				result = no / i;
			} catch (Exception e ) {
				System.out.println("예외 발생 ] 0으로 나누는 연산을 시도했습니다.");
				result = no;
			}
			
			System.out.println(no + "를" + i + "로 나눈 결과는" + result + "입니다.");
		}
	}
	
	

	public static void main(String args[]) {
		new Test04();
	}
}
