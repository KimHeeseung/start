package day15;
import java.util.*;
import java.util.regex.*;

public class Test03 {

	public Test03() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름입력");
		String name = sc.nextLine();
		
		Pattern form = Pattern.compile("[가~힣](2,5)");
		Matcher mat = form.matcher(name);
		
		boolean bool = mat.matches();
		
		String result = bool ? "올바른" : "잘못된";
		
		System.out.println("입력받은 이름 [" + name + "] 은" + result + "이름입니다.");
	}
	public static void main(String args[]) {
		new Test03();
	}
}
