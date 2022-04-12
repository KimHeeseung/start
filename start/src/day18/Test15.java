package day18;

public class Test15 {

	public Test15() {
		Jin jin = new Jin(); 
		
		jin.start();
		
		for(int i = 0; i < 10; i ++) {
			System.out.println("서진씨 복습합니다." + (i + 1));
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		jin.setStart(false);	
		//위 명령이 모두 실행이 끝나면 메인 내용이 완료되었으므로 스레드도 종료시킨다.
	}
	public static void main(String args[]) {
		new Test15();
		
		System.out.println("\t\t\t ### 앙 종료띠 ###");
	}
}

class Jin extends Thread {
	private boolean isStart = true;


	public boolean isStart() {
		return isStart;
	}


	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}


	@Override
	public void run() {
		while(isStart) {
			System.out.println("\t\t*** 선생님이 졸고있습니다.");
			try {
				Thread.sleep(200);
			}catch(Exception e) {}
		}
	}
}