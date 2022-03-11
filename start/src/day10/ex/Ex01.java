package day10.ex;

import day10.Friend;
import day10.ts2;

/*
	문제 1 ]
		다음 변수를 가지는 Student 클래스를 제작하세요.
		
		String name;
		int ban, no, kor, eng, math;
		
		클래스를 만들고
		
		Ex01 클래스에서
			한명의 데이터를 입력해서 출력하기
			5명의 데이터를 배열로 만들어 데이터 입력하고 출력하고...
			
		1. 한개의 함수내에서 처리하기..
		2. 기능별로 분리해서 함수 만들어서 처리...
		
		보너스 ]
			int rank, total;
			double avg;
		
 */
public class Ex01 {
	// 변수 선언
	String[] names;
	int[] bans;
	int[] nos;
	int[] kors; //국어점수
	int[] engs; //영어점수
	int[] maths; //수학점수
	
	Friend[] black;
	int total;
	double avg;
	
	public Ex01() {
		
		String names = "제니";
		int bans = 1;
		int nos = 1;
		int kors = 100;
		int engs = 84;
		int maths = 54;
		int total = kors + engs + maths;
		double avg = total / 3;
		System.out.println("이름 :" + names);
		System.out.println("반 : " + bans+"반");
		System.out.println("번호 : " + nos);
		System.out.println("국어 : " + kors);
		System.out.println("영어 : " + engs);
		System.out.println("수학 : " + maths);
		System.out.println("총점 : " + (kors + engs +maths));
		System.out.println("평균 : " + (avg));
		System.out.println("============================================");
		// 데이터 변수들 셋팅하고
		setData();
		
		// 배열 완성하고
		setBlack();
		
		// 출력
		toPrint();
	}
	
	// Friend 배열 내용 출력해주는 함수
	public void toPrint() {
		// 이함수가 호출되면 전역변수 black 의 내용을 출력할 일이 있을 때이므로
		// 별도로 데이터를 입력받지 않아도 배열에 접근가능하다.
		for(int i = 0 ; i < black.length ; i++ ) {
			String name = black[i].getName();
			int bans = black[i].getBan();
			int nos = black[i].getNo();
			int kors = black[i].getKor();
			int engs = black[i].getEng();
			int maths = black[i].getMath();

			int total = kors + engs + maths;
			double avg = total / (double)3; 
			
			System.out.println("이름 : " + name);
			System.out.println("반 : " + bans +"반");
			System.out.println("번호 : " + nos);
			System.out.println("국어 : " + kors);
			System.out.println("영어 : " + engs);
			System.out.println("수학 : " + maths);
			System.out.println("총합은 :"+(total));
			System.out.println("평균은 :"+(avg));
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		}
	}
	public void setBlack() {
		// 데이터 기억할 공간 확보하고
		black = new Friend[5];
		
		// 확보된 공간에 데이터 채워주고
		for(int i = 0 ; i < black.length ; i++ ) {
			black[i] = new Friend();
		}
		
		// 각 방의 객체에 데이터 채워주고
		for(int i = 0 ; i < black.length ; i++ ) {
			Friend f = black[i];
			
			f.setName(names[i]);
			f.setBan(bans[i]);
			f.setNo(nos[i]);
			f.setKor(kors[i]);
			f.setEng(engs[i]);
			f.setMath(maths[i]);
//			black[i] = f; // 주소를 인덱스위치의 내용과 변수가 공유하기 때문에 의미가 없다.
		}
	}
	
	// 각 데이터를 초기화 시켜주는 함수
	public void setData() {
		names = new String[] {"제니", "리사", "로제", "지수","둘리"};
		bans = new int[]{1,2,3,4,5};
		nos = new int[]{1,2,3,4,5};
		kors = new int[]{100,54,68,79,54};
		engs = new int[]{87,100,54,68,79};
		maths = new int[]{54,87,100,79,68};

	}
	
	
	public static void main(String[] args) {
		new Ex01();
	}

}