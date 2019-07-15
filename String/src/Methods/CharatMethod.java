package Methods;

public class CharatMethod {

	public static void main(String[] args) {
		String s = "pritesh muli";
		String sp = "pritesh muli";
		char d = s.charAt(1);
		System.out.println(d);
		// compareto method
		int i = s.compareTo(sp);
		System.out.println(i);
		// contains method
		boolean r = s.contains(sp);
		System.out.println(r);
		// endsWith method
		boolean t = s.endsWith("t");
		System.out.println(t);
		System.out.println(s.endsWith("i"));
		// equals method
		System.out.println(s.equals(sp));
		// format method
		// System.out.println(s.format(format, args));
		// indexof method
		System.out.println(s.indexOf("l"));
		// length method
		System.out.println(s.length());
		// repalace method
		System.out.println(s.replace("i", "j"));
		//replace all method
	//	System.out.println(s.rep);
	}

}
