
public class PalindromNumber {
	public static boolean palindrom (String s){
		
		String s1="";
		
		char[] sp= s.toCharArray();
		
		for (int i = sp.length-1; i >=0; i--) {
			s1+= sp[i];
		}
		if(s1.equals(s)) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		System.out.println(palindrom("ppupp"));

	}

}
