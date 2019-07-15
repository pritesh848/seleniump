package linklist;

import java.util.LinkedList;

public class Runner {
public static void main(String[] args) {
	LinkedList list = new LinkedList();
	list.add(4);
	list.add("abc");
	System.out.println(list.contains(4));
	list.get(0);
	list.indexOf('l');
	System.out.println(list.toString());
	Linklist list2 = new Linklist();
	list2.insert(5);
}
}
