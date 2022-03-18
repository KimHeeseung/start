package day14;
import java.util.*;
public class Test05 {

	public Test05() {
		String member = "제니,리사,로제,지수";
		
		//, 를 기준으로 자른다
		StringTokenizer token = new StringTokenizer(member, ",");
		/*
		 	이렇게 객체가 만들어지면
		 	잘려진 결과는 버퍼메모리에 기억이되고
		 	하나씩 꺼내서 사용해야 하는데
		 	주의사항은
		 	한번꺼낸데이터는 즉시 메모리에서 사라진다
		 	따라서 결과를 사용해야 한다면
		 	변수나 배열등에 기억시켜놓아야 한다.
		 */
		// 하나씩 꺼내서 출력한다.
		
		int len = token.countTokens(); // 잘려진 데이터의 갯수를 반환해주는 함수
		
		//데이터를 기억할 배열
		String[] pink = new String[len];
		
		//인덱스 변수 만들고
		int idx = 0;
		

		
		while(token.hasMoreTokens()) {
			String black = token.nextToken();
			
			//배열에기억
			pink[idx] = black;
			//인덱스 증가
			idx++;
			//출력
			System.out.println(black);
	}
		System.out.println("----------------------------------------");
		
		while(token.hasMoreTokens()) {
			String black = token.nextToken();
			
			System.out.println(black);
	}
		
		for(String name : pink) {
			System.out.print(name + "|");
		}
		System.out.println();
}
	public static void main(String args[]) {
		new Test05();
	}
}
