package day11;

/*
 *  삼각형 클래스와 사각형 클래스를 각각 개체로 만들어서
 *  내용을 출력해보자.
 */
import static java.lang.Math.*;

public class Test05 {
	public Test05() {
		Samgak sam = new Samgak((int)(random()*21+5),(int)(random()*21+5));
		Sagak nemo = new Sagak((int)(random()*21+5),(int)(random()*21+5));
		
		System.out.printf("밑변이 %3d 이고 높이가 %3d 이고 넓이가 %6.2f 인 삼각형\n " 
																		, nemo.getWidth(), nemo.getHeight(),nemo.getArea());
		System.out.printf("밑변이 %3d 이고 높이가 %3d 이고 넓이가 %6.2f 인 삼각형\n " 
																		,sam.getWidth(), sam.getHeight(),sam.getArea());
		
		Figure f1 = sam;
		Figure f2 = nemo;
	}

	public static void main(String[] args) {
		new Test05();

	}

}
