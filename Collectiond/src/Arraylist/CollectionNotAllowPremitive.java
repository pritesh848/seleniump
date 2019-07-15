package Arraylist;

import java.util.ArrayList;

public class CollectionNotAllowPremitive {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		Object obj= al.get(0);
		//obj++;>> type mis-match cannot convert from object to integer 
		String s= "pritesh muli oPLKIKK".toLowerCase();
		String[] c = s.split(" ");
		  String n = "";
          String tn = "";
		for (int i = 0; i < c.length; i++) {
			n=c[i];
			
		for (int j = 0; j < n.length(); j++) {
			if (j==0) {
				tn=tn+" "+Character.toString(n.charAt(j)).toUpperCase();
			}else {
				tn=tn+n.charAt(j);
			}
		}	
		}	
		System.out.print(tn.trim());
//		  n.toUpperCase();
//		}
//		
//		
//		
//		char []a = s.toCharArray();
//		for (int i = 0; i < a.length; i++) {
//			Character n= a[i];
//			
////			char s =n;
//			System.out.println(n);
//		}
//		
//System.out.println("n");
	

	}
	}
