package day18;
public class Test09 {

	public Test09() {
		
		MyThread01 sohyun = new MyThread01();
		MyThread02 heeseon = new MyThread02();
		
		sohyun.start();
		heeseon.start();
		System.out.println("============ 생성자 쪽 종료 =============");
		
	}

	public static void main(String[] args) {
		new Test09();
		System.out.println("============ 메인함수 종료 =============");
	}

}
/*
 	원래는 스레드 프로그램 역시 다른 파일에 클래스를 만들어야 하는데
 	지금은 간단한 테스트이므로 하나의 클래스 내에서 만들도록 한다.
 	두개의 스레드 프로그램을 만들어 보자.
 */

class MyThread01 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("### 김희승씨가 코딩을 합니다. :" + (i +  "회차"));	
		}	
	}
}
class MyThread02 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("### 한서라 코딩을 합니다. :" + (i +  "회차"));
	
		}
	}
}