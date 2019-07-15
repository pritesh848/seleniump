package set;

import java.util.HashSet;
/*
 * 
 */

public class HashSet1 {
     public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(5);
		hs.add("pritesh");
		hs.add(5);
		hs.add(56);
		hs.add(null);
		hs.add(3.52f);
		hs.add(55656);
		hs.add(56);
		hs.add("kfkf");
		hs.add(2);
		System.out.println(hs.size());
		System.out.println(hs);
	}
}
