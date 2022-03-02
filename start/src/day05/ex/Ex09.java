package day05.ex;

/*
	문제 9 ]
		1 - 2 + 3 - 4 + 5 - 6 .... 했을 경우
		어디까지 계산하면 그 결과가 100을 넘기게 되는지 출력하세요.
		
		no* -1
 */
public class Ex09 {

	public static void main(String[] args) {
		
		int num = -1;
		int sum = 0;
		int i = 1;
		for(i = 1; ; i++) {
			num =num * -1;
			sum = sum + i * num;
			if(sum > 100) {
				break;
		}
			
		}
		System.out.println("1부터 " + (i  * num) + "까지 합이 " +sum+ "처음 100 을 넘기게 된다." );
	}

}