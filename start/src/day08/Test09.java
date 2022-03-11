package day08;
import java.util.*;

public class Test09 {
	public static void main(String args[]) {
		// 입력도구 준비하고
				Scanner sc = new Scanner(System.in);
				// 메세지 출력하고
				System.out.print("계산식을 입력하세요! : ");
				// 입력받아서 기억하고
				String str = sc.nextLine();
				
				// 배열 준비하고
				String[] sik = new String[3];
				// 배열에 문자열 잘라서 집어넣고
				int idx = 0; // 연산기호의 위치값을 기억할 변수
				
				// 반복해서 추출해서 연산기호의 위치를 찾아낸다.
				for(int i = 0 ; i < str.length(); i++ ) {
					char ch = str.charAt(i);
					
					if(ch < '0' || ch > '9') {
						// 이 경우 추출한 문자는 숫자형태의 문자가 아니므로 
						// 연산기호에 해당한다.
						idx = i;
						break;
					}
				}
				sik[0] = str.substring(0, idx);
				sik[1] = str.substring(idx, idx + 1); // str.charAt(idx) + ""
				sik[2] = str.substring(idx + 1);
				
				// 계산하고
				int no1 = Integer.parseInt(sik[0]);
				int no2 = Integer.parseInt(sik[2]);
				
				double result = 0.0;
				
				switch(sik[1]) {
				case "+":
					result = no1 + no2;
					break;
				case "-":
					result = no1 - no2;
					break;
				case "*":
					result = no1 * no2;
					break;
				case "/":
					result = no1 / (double)no2;
					break;
				}
				
				// 결과 출력하고
				System.out.println("입력한 계산식\n\t" + str + "\n의 결과는 \n\t" + result);
			}

		}