

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class PrintDuplicateOccourance {
    //if (!driver.switchTo().window(itr.next()).equals(parent))

	public static void main(String[] args) {
		
               ArrayList bl= new ArrayList();
          		HashSet hp = new HashSet();
               
               bl.add('l');
               bl.add(5);
               bl.add(5);
               bl.add(9);
               bl.add("geek");
               bl.add("seek");
               hp.addAll(bl);
             for (Object s : hp) {
				System.out.println(s+" :"+Collections.frequency(bl, s));
			}
               
               
               
            		   
	}

}
