package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("name", "pritesh");
		m.put("address", "aurangabad");
		m.put("company", "resonantia");
		
		System.out.println(m.get("name"));
		
		Set st = m.entrySet();
	Iterator i = 	st.iterator();
	
//	for (Object object : st) {
//		System.out.println(object);
//	}
//		
		
		

	}

}
