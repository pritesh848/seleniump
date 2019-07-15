package collection;

//HashSet - finds duplicate and also arrange by assending order
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		int []p = {5,7,9,6,41,5,7,9};
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < p.length; i++) {
			set.add(p[i]);
		}
		for (Integer integer : set) {
			System.out.println(integer);
		}
//		set.add(p[0]);
//		set.add(9);
//		set.add(5);
//		set.add(4);
//		set.add(1);
//		set.add(2);
//		set.add(1);
//		for (Integer integer : set) 
//			System.out.println(set);
//		}
		//System.out.println(set);

	}

}
