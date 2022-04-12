package day18;

import java.io.*;
import java.io.BufferedReader;

public class Test08 {

	public Test08() {
		//기본 스트림 준비
		FileInputStream fin = null;
		//보조 스트림
		InputStreamReader isr = null;
		//보조스트림
		BufferedReader br = null;
		
		try {
			fin = new FileInputStream("src/day18/result/blackpink.txt");
			isr = new InputStreamReader(fin);
			br = new BufferedReader(isr);
			
			//몇번 읽어야 할지 알수 없으므로
			while(true) {
				String str = br.readLine();
				
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				isr.close();
				fin.close();
				
			}catch(Exception e) {}
	}
}
	public static void main(String args[]) {
		new Test08();
	}
}
