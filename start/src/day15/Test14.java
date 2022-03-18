package day15;
import java.util.*;

public class Test14 {

	public Test14() {
		
		TreeSet set = new TreeSet(new Comparator() {
			
			@Override
			public int compare(Object o1, Object o2) {
				
				Won w1 = (Won) o1;
				
				Won w2 = (Won) o2;
				
				int result = w1.getRad() = w2.getRad();
				
				return -result;
			}
		});
		Won w1 = new Won(5);
		Won w2 = new Won(10);
		
	}

}
