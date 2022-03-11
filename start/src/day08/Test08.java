package day08;

/*
 * 	
 */

public class Test08 {
	public static void main(String args[]) {
		//문자열 변수
		String str = "Black pink";
		
		//잘라낸 단어 변수
		String word1, word2;
		
		//black 추출
		//'의 위치
		int idx1 = str.indexOf(' '); //문자열중 특정문자의 위치값 알려주는 함수
		word1 = str.substring(0,5);
		word1 = str.substring(0,idx1);
		
		//pink
		word2 = str.substring(str.indexOf('p'));
		
		//출력
		System.out.println(word1);
		System.out.println(word2);
	}

}
