package day15;

import java.util.StringTokenizer;

public class Test01 {

	public Test01() {
		String url = "http:://www.blckpink.org/member/?id=ens&qw=12345&tel=01031754444";
		
		int idx = url.indexOf('?');
		String param = url.substring(idx + 1);
		
		System.out.println(param);
		
		//만들어진 문자열을 &를 기준으로 잘라내서 배열에 담아보장
		StringTokenizer token = new StringTokenizer(param,"&");
		//잘려진 갯수 알아내기
		int cnt = token.countTokens();
		//문자의 배열
		String[] tmp = new String[cnt];
		
		for(int i = 0; token.hasMoreTokens() ; i++) {
			tmp[i] = token.nextToken();	// 이 명령을 실행하는 순간 버퍼메모리에서 꺼낸 데이터는 삭제하게 된다.
		}
		System.out.println();
		String[][] data = new String[cnt][2];

	}
	public static void main(String args[]) {
		new Test01();
	}
}
