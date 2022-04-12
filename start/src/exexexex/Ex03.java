package exexexex;

public class Ex03 {
	public Ex03() {
		int no = 1;
		for(int i = 0; i < 5; i ++) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.print(no++ + " ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		new Ex03();
	}
}