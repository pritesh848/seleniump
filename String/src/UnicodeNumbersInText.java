
public class UnicodeNumbersInText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str =  "priteshmuli";
  System.out.println("Original String: " + str);
  int ctr = str.codePointCount(1,2);
  System.out.println("code point count = "+ ctr);
	}

}
