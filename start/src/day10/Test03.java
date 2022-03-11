package day10;

public class Test03 {
	String[] names;
	String[] tels;
	String[] email;
	String[] birthday;
	int[] naee;
	char gen;
	String addrs;
	
	public Test03() {
		// 멤버변수들 초기화
		setData();
		//필요한 데이터들이 준비된 상태
		
		//각 멤버를 배열 하나로 관리
		
		Friend[] black = getBlack();
		
		//내용 출력
		for(Friend f : black) {
			System.out.println(f);
			//이렇게하면 friend 클래스에 재정의한 toString() 함수가 자동 호출
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		//다시 출력
		toPrint(black);
	}
	
	public void toPrint(Friend[] b) {
		for(int i = 0; i < b.length; i++) {
			String name = b[i].getName();
			//이때 배열의 각 방에 기억된 객체들의 멤버변수는 접근이 불간으 하므로 함수를접근 할 수있는 함수를 호출해서 처리
			String addr = b[i].getAddr();
			String tel = b[i].getTel();
			String mail = b[i].getMail();
			String birth = b[i].getBirth();
			int age = b[i].getAge();
			char gen = b[i].getGen();
			
			System.out.println("이름 : " + name);
			System.out.println("주소 : " + addr);
			System.out.println("전화 : " + tel);
			System.out.println("메일 : " + mail);
			System.out.println("생일 : " + birth);
			System.out.println("나이 : " + age);
			System.out.println("성별 : " + (gen == 'M' ? "남자" : "여자"));
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		}
		
	}
	
	//준비된 데이터를 Friend[] 타입의 데이터로 만들어서 반환해주는 함수
	public Friend[] getBlack() {
		//이 함수는 Friend[] 배열을 만들고
		Friend[] anne = new Friend[4]; // 아직 각 방에 Friend 타입의 객체는 들어가있지 않고 기억할 공간만 확보한 상태
		//각 방에 Friend 객체들을 채워넣는다
		for(int i = 0; i < 4; i++) {
			anne[i] = new Friend();
		}
		
		for(int i = 0; i < anne.length; i++) {
			Friend f= anne[i];
			String name = names[i];
			f.setName(name);
			
			f.setAddr(addrs);
			f.setTel(tels[i]);
			f.setMail(email[i]);
			f.setBirth(birthday[i]);
			f.setGen(gen);
		}
				
		// 채원채의 배열을 반환해준다.
		return anne;
	}
	
	public void setData() {
		
		names = new String[] {"제니", "리사", "로제", "지수"};
		tels = new String[] {"010-1111-1111","010-1111-1111","010-1111-1111","010-1111-1111"};
		email = new String[] {"jennie@githrd.com","lisa@githrd.com","rose@githrd.com","jisoo@githrd.com"};
		birthday = new String[] {"1996/03/08","1995/04/05","1998/05/05","1997/07/07"};
		naee = new int[] {27, 28, 26, 27};
		
		gen = 'f';
		addrs = "ygM";
		
	}
	public static void main(String args[]) {
		new Test03();
	}

}
