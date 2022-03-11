package day08;

public class Test01 {
	public static void main(String args[]) {
		//할일
		
		//배열만들기
		int[] numCount = new int[10]; 
		//(반복)랜덤하게 숫자를 발생
		for(int i = 0 ; i < 100 ; i++) {
			//랜덤하게 숫자를 발생
			int no = (int) (Math.random()*10);
			//이렇게 위에서 발생된 숫자는 위에 만든 numCount배열의 위차값으로 사용하고
			//그 위치값의 숫자를 1을 증가시켜주면 된다.
			//발생된 숫자의 카운트 +1
			numCount[no] += 1;

			
			
		}
		//결과를 출력
		
		//숫자로 표현
		for(int i = 0; i < numCount.length; i++) {
			int no = i; //숫자 (index)
			int count = numCount[i]; //(발생한 횟수)
			
			//숫자 출력
			System.out.println(no + " : " + count);
		}
		for(int i = 0; i < numCount.length ; i++) {
			int count = numCount[i];
			
			System.out.print(i + " : ");
			//count 횟수만큼 특수문자를 출력해야 하므로 반복문으로 처리한다.
			for(int j = 0; j < count; j++) {
				//출력
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/*
		 * 	'A' + 0 ==> 'A'
		 * 	'A'	+ 1 ==> 'B'
		 */
		
	}
}
