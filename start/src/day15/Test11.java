package day15;
import java.util.*;

public class Test11 {

	public Test11() {
		ArrayList list = new ArrayList();
		
		for(int i = 0; i < 10; i++) {
			Won w = new Won((int)(Math.random()*21 + 5));
			
			list.add(w); // 이 순간 won 데이터는 Object 타입으로 자동 형변환이 되서 기억이된다.
		}
		System.out.println("1 . 내림차순 정렬 전");
		for(Object o : list) {
			//이때 꺼낸 데이터 o는 원래난 Won 객체를 입렵한 것이다.
			// 따라서 원래 데이터로 강제 형변환한다.
			
			Won w = (Won) o;
			System.out.println(w);
			
		}
		
		System.out.println("---------------------------------------------------------");
		//정렬
		Collections.sort(list, new Comparator() {
			
			@Override
			public int compare(Object o1, Object o2) {
				int result = 0;
				
				Won w1 = (Won) o1;
				Won w2 = (Won) o2;
				
				double area1 = w1.getArea();
				double area2 = w2.getArea();
				
				result = ((area1 - area2) <=0) ? -1 : 1;
				
				return -result;
			}
		});
		System.out.println("2 . 내림차순 정렬 후");
		for(Object o : list) {
			//이때 꺼낸 데이터 o는 원래난 Won 객체를 입렵한 것이다.
			// 따라서 원래 데이터로 강제 형변환한다.
			
			Won w = (Won) o;
			System.out.println(w);
			
		}
		
	}
	public static void main(String args[]) {
		new Test11();
	}
}
