package day05.ex;

public class Ex01 {
	public static void main(String[] args) {
		//결과값 변수 만들고
		
		int[] num = {1,2,3,4,5,6,7,8}; //1~ 6까지 관리하는 정수배열 
		int hap = 0;
		// 반복해서 누적 대입하고
		for(int i = 0 ; i < 10; i++ ) {
			hap = hap+(i+1);
		}
		System.out.println("1~10 까지의 합은" + hap + "입니다.");
		
		int gop = 1;
		for (int i = 0; i < 10; i++) {
			gop = gop *(i +1);
		}
		System.out.println("1~10 까지의 곱은" + gop + "입니다.");
	}
	

}
