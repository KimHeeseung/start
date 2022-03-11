package day07;

import java.util.Arrays;

public class Test01 {

	public static void main(String args[]) {
		
		/*
		 * 정수 6개를 관리할 배열 arr 을 만들고
		 * 1~6까지 채워서
		 * 한개씩 꺼내서 출력하세요.
		 * 
		 * 
		 * 배열변수선언
		 * 
		 * 배열 변수의 선언 형식
		 * 	데이터타입 [] 변수;
		 * 
		 */
		int[] arr;
		//배열변수 초기화
		arr = new int[6];
		int len = arr.length;
		for(int i = 0; i < len ; i++) {
			int no = arr[i];
			
			System.out.println(no);
			//출력
			//참고 배열의 길이를 알아내는 방법 : 배열.length
			
			/*
			 * Heap 에 만들어지는 기본데이터타입 변수들은 모두
			 * 자동초기화 된다.
			 * boolean : false
			 * char : 아스키 코드값 0에 해당하는 문자
			 * byte : 0
			 * short :0
			 * long :0
			 * float :0
			 * double :0
			 * 
			 */
			
			
	
		//블랙핑크 멤버의 이름을 기억할 배열을 만들어서 출력하세요	
		}
		String[] blackpink = new String[4];
		
		for(int i = 0; i < blackpink.length; i++) {
			//int len = blackpink.lenth;
			System.out.println(blackpink[i]);
			
			}
		
		blackpink[0] = "제니";
		blackpink[1] = "로사";
		blackpink[2] = "로제";
		blackpink[3] = "지수";
		//출력 내용확인용
		
		System.out.println(Arrays.toString(blackpink));
		
		//데이터를 하나씩 꺼내서 출력
		for(int i = 0 ; i < blackpink.length; /*int len = blackpink.length 똑같은 의미  */i++) {
			/*
			 * 참고 ] 
			 * 		여러개의 데이터를 관리하는 데이터 타입들은
			 * 		데이터 한개를 꺼냈을 때의 그 데이터의 타입을먼저 생각해봐야 한다.
			 * 		
			 * 		
			 */
		}
		String[] tmp = new String[5];
		for(int i = 0; i <4; i++ ) {
			tmp[i] = blackpink[i];
		}
		tmp[4] = "둘리";
		blackpink = tmp;
		
		//하나씩 꺼내서 출력
		//배열과 같은 데이터는 향상된 for 명령이 데이터를 꺼내서 사용하는데 편하다.
		
		for(String name : blackpink) {
			//의미 : blackpink의 데이터를 하나씩 꺼내서 name 변수에 기억시키세요.
			
			System.out.print(name + " ");
		}
		
		
		
		
			}

	
	}
