package exexexex;

public class Ex02_01 {
	
	public Ex02_01() {
		String str = "asdasdf";
		
		char ch = str.charAt(0);
		String namuji = str.substring(1);
		
		//ch 를 대문자로
		char ch1 = (char) (ch - ('a' - 'A'));
		str = ch1 + namuji;

		
		System.out.println(str);
	}

	public static void main(String[] args) {
		new Ex02_01();

	}

}
