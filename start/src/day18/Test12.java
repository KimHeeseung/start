package day18;

public class Test12 {

	public Test12() {
		Jennie jn = new Jennie();
		Lisa ls = new Lisa();
		
		jn.start();
		ls.start();
		
	}
	public static void main(String args[]) {
		new Test12();
	}
}
class Jennie extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 1000; i ++) {
			System.out.println("Jennie 가 " + (i + 1) + "번째 노래를 합니다.");
			
			
			yield();
		}
	}
}
class Lisa extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 1000; i ++) {
			System.out.println("\t\tLisa 가 " + (i + 1) + "번째 노래를 합니다.");
			yield();
		}
	}
}