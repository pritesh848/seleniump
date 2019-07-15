package cursors;

import java.util.HashSet;
import java.util.Iterator;

/*
 * iterators used to iterate  elements of any collection
 * it is an interface which has an abstract methods
 * methods .. > 1.hasNext() - return true if collection has an element.
 * > 2. next() - return data element from collection in the form of object
 * > 3. remove()- remove the particular element
 * >  3.  drawback is it can read collection in forward direction only 
 * 
 * 
 */
public class Iterator1 {
  public static void main(String[] args) {
	  HashSet hs = new HashSet();
		hs.add(5);
		hs.add(5);
		hs.add(56);
		hs.add(55656);
		hs.add(56);
		hs.add("kfkf");
		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(hs);
	
}
}
