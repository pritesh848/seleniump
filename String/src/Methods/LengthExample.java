package Methods;

public class LengthExample {

	public static void main(String[] args) {
		String sp = "pankaj";
		String x = "Pankaj";
		System.out.println("equals method output is --");
		if (sp.equalsIgnoreCase(x)) {
			System.out.println("equal");	
		}
		else {
			System.out.println("not equal");
		}
		char[] s = {'p','r','i','t','e','s','h'};
	int g =	s.length;
		String s1 = new String(s,0,g);  // for s string from zeroth index till next 4 will be printed "prit"
		System.out.println(new String(s,0,4));
		char c = sp.charAt(3);
		System.out.println("String constructror with length  --");
		System.out.println(s1);
		System.out.println(g);
		System.out.println(c);
		//concat
		System.out.println("concat method output");
		sp.concat(x);
		
		System.out.println(sp.concat(x));

	}

}
