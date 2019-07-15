
public class Pattern5 {

	public static void main(String[] args) {
		
		for (int i = 0; i <=5; i++) 
			
		{
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int line = 0; line <= i; line++) {
				System.out.print("* ");
			
			}
			System.out.println();
		}

	}

}
