package day15;
import java.util.*;

public class Test07 {

	public Test07() {
		ArrayList vec = new ArrayList();
		
		vec.add("제니");
		vec.add('F');
		vec.add(27);
		vec.add(168.5);
		vec.add(false);
		
		//자동화 처리
		
		for(int i = 0; i < vec.size() ; i ++) {
			
			Object o = vec.get(i);
			
			if(o instanceof String) {
				String str = (String) o;
				System.out.println("이름 : " + str);
			}else if(o instanceof Integer) {
				int age = (int) o;
				System.out.println("나이 : " +age);
				
			}else if(o instanceof Character) {
				char gen = (char) o;
				System.out.println("성별 : " + gen);
				
			}else if(o instanceof Double) {
				double height = (double) o;
				System.out.println("체중 : " + height);
				
			}else if(o instanceof Boolean) {
				boolean bool = (boolean) o;
				System.out.println("학원 : " +bool);
				
			}
		}
		
		/*
		 	컬렉션의 특징은 여러형태의 데이터를 동시에 보관할 수 있다는 것이다.
		 	하지만 실무에서는 잘 안쓴다
		 
		 */
		
		
	
	}
	public static void main(String args[]) {
		new Test07();
	}
}
