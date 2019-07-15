package TryCatch;

public class TryCatchDemo {
	public static  void add() {
		
		int i = 5/0;
		throw new ArithmeticException("sorry");
		
   
	}

	public static void main(String[] args) {
	
add();
	}

}
