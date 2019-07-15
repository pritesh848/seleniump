package Arraylist;

import java.util.ArrayList;






public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(0, "element");
		al.add(new Employee());
		al.add(new Client());
		al.add(10);
		al.add("pritesh");
		al.add('s');
		al.ensureCapacity(12);
		al.add(4, "klj");
		//al.add(10, "element");// exception
		al.add(7, "element");
		
		
		al.add(2, "klk");
		System.out.println(al.size());
		//Object[] r = new Object[5];
		for (Object valu : al) {
			System.out.println(valu+" ");
			
		 
		}
	
	}

} 
