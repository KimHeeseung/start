package day18;

public class Test11 {

	public Test11() {
		NameThread t1 = new NameThread("\t\t리사");
		NameThread t2 = new NameThread();
		//두 쓰레드가 New Born 상태가 됬다.
		
		//Runnable 상대토 전위시킨다.
		
		t1.start();
		t2.start();
		
	}
	public static void main(String args[]) {
		new Test11();
	}
}

class NameThread extends Thread{
	/*
	 	하나의 프로그램을 이용해서 여러번 실행할 경우
	 	구분할 필요가 생길 수 있다.
	 	
	 	구분할 수 잇는 방법은 여러가지 있다.
	 	
	 		1. 변수 하나를 만들고 그 변수에 값을 다르게 입력해서 구분하는 방법
	 		
	 			String name ;
	 			
	 		2. 스레드 프로그램 자체에 이름을 부여하는 방법
	 			이때는 상위 클래스인 Thread의
	 				Thread(String name)
	 			를 이용하면 된다.
	 			즉, 상위 클래스의 기본 생성자가 아닌
	 			다른 생성자를 이요하면 스레드에 이름을 부여할 수 있다.
	 			
	 				super();
	 			이 명령은
	 				1. 반드시 생성자 안에서만 사용해야 하고
	 				2. 반드시 첫줄 첫문장으로 사용해야 한다.
	 */
	
	
	public NameThread() {
		super("jenni");
	}
	
	public NameThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		
		for(int i = 0; i < 1000; i ++) {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name + " 가 " + (i+1) + "번째 노래를 합니다.");
		}
	}
}