package collection;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("a");
		list.add("s");
		list.add("h");
		
		java.util.Iterator<String> iterator = list.iterator();
		
		System.out.println("list elements : ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
			
		}
		

	}

}
