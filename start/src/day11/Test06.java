package day11;

public class Test06 {

	
	public Test06() {
		Grand g1 = new Grand();
		
		Grand g2 = new Father();
		
		Grand g3 = new Son();
		
		System.out.print("g1.abc() : ");
		g1.abc();
		System.out.print("g2.abc() : ");
		g2.abc();
		System.out.print("g3.abc() : ");
		g3.abc();
		System.out.println("g1.no : " + g1.no);
		System.out.println("g2.no : " + g2.no);
		System.out.println("g3.no : " + g3.no);
		
		((Father) g2).xyz();
		((Father) g3).xyz();
	}
	
	
	public static void main(String args[]) {
		new Test06();
	}
}


class Grand {
	int no = 80;
	void abc() {
		System.out.println("나는 Grand....!");
	}
}

class Father extends Grand {
	int no = 40;
	void abc() {
		System.out.println("나는 Fathser ....!");
	}
	void xyz() {
		System.out.println("**************************");
	}
}
class Son extends Father {
	int no = 10;
	void abc() {
		System.out.println("나는 Son...!");
	}
	void xyz() {
		System.out.println("########################");
	}
}