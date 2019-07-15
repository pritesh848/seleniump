package Methods;

public class Immutable {

	public static void main(String[] args) {
		
		String s = new String("Testing ");
		s=s.concat("shastra ");
		 String s1= s.concat(".shastra");
		System.out.println(s);
		 System.out.println(s1);

	}

}
