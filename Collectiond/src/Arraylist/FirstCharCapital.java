package Arraylist;

public class FirstCharCapital {

	public static void main(String[] args) {
		String s = "i love india";
		String[] s1 = s.split(" ");
		String s2="";
		String s3="";
		for (int i = 0; i < s.length(); i++) {
			s2=s1[i];
			for (int j = 0; j < s2.length(); j++) {
				if (j==0) {
					s3=s2.toUpperCase();
				}else {
					s3=s3+s2;
				}
			}
			
			System.out.println(s2);
		}
	}

}
