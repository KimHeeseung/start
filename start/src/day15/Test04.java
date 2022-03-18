package day15;

import java.util.regex.*;

public class Test04 {

	public Test04() {
		String tel = "HP : 010-1234-5678";
		
		Pattern form = Pattern.compile("01[0-9]-\\d{3,4}-\\d{4}");
		Matcher mat = form.matcher(tel);
		
		if(mat.find()) {
			String hp = mat.group();
			// 출력
			System.out.println("전화번호 : " + hp);
		}
	}

	public static void main(String[] args) {
		new Test04();

	}

}
