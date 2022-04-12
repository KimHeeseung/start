package ping;

import java.util.*;

public class pingServer {
	private boolean bool = true;
	private PingThread ping;
	private Scanner sc;
	
	//2-1
	public pingServer() {
		ping = new PingThread();
		
		sc = new Scanner(System.in);
		
		loop:
		while(true) {
			System.out.println();
			System.out.println(" 핑서버프로그램 \n서버시작 : start\n서버중단 : quit\n명령을 입력하세요.");
			String str = sc.nextLine();
			//2-2
			switch(str) {
			case "start":
				if(bool) {
					ping.start();
					bool = false;
					try {
						Thread.sleep(200);
					} catch(Exception e) {}
					break;
				}
				System.out.println("이미 서버가 실행중입니다.");
				break;
			case "quit":
				ping.setStart(false);
					ping.close(ping.getOut());
					ping.close(ping.getIn());
					ping.close(ping.getSocket());
					ping.close(ping.getServer());
				break loop;
			}
		}
	}

	public static void main(String[] args) {
		new pingServer();
	}

}