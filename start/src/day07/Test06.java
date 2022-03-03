package day07;

public class Test06 {
	
	public static void main(String[] args) {
		int[] num = new int[10];
		for(int i = 0; i < 10; i++) {
			num[i] = i+1;
		}
		for(int i = 0; i < 100; i++) {
			int idx1 = (int)(Math.random() * 10);
			int idx2 = (int)(Math.random() * 10);
			
			if(idx1 == idx2) {
				i --;
				continue;
			}
			int tmp = num[idx1];
			num[idx1] = num[idx2];
			num[idx1] = tmp;
			
			//출력
			for(int no : num) {
				System.out.print(no + " | ");
				
			}
			System.out.println();
		}
	}
}
