package set;

import java.util.TreeSet;

public class TreSet1 {
	/*
	 * sort in natural sorting ordre strictly
	 * homogenous in nature , (only one type of data is allowed) class cast exception is there if add many type data
	 * doesn't preserve sorting order .
	 * backend data strcture is balanced tree 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeSet hs = new TreeSet();
     hs.add(5);
		hs.add(5);
		hs.add(56);
		hs.add(55656);
		hs.add(56);
		hs.add("khgkj");
	//	hs.add('h');
		int []ar= {5,5,87};
		hs.add(ar);
		System.out.println(hs.toString());

	}

}
