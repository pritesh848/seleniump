package Methods;

import java.util.Iterator;

public class SplitDemo {

	public static void main(String[] args) {
    String scr = ("pritesh, mahesh, pankaj , sanket, chinmay , aroh, kedar , mayur, mangesh");
  String names[]  = scr.split(",");
  for (String fg : names) {
	System.out.println(fg);
}
    System.out.println(names[5]);
    

	}

}
