package set;

import java.util.LinkedHashSet;
/**
 * insertion order is preserved
 * bckend data strcture is hashtable and doubly linked list 
 * null insertion is possible 
 * it doesn't sort data even if data is of same type
 * @author pritesh
 *
 */

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(5);
		hs.add(5);
		hs.add(56);
		hs.add(55656);
		hs.add(56);
		hs.add("khgkj");
		hs.add('h');
		int []ar= {5,5,87};
		hs.add(ar);
		System.out.println(hs.toString());

	}

}
