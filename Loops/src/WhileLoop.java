
public class WhileLoop {

	public static void main(String[] args) {
		int i = 6;
		while (i <= 10) {
			System.out.println("Number is less than 10 ");
			if (i % 2 == 0) {
				System.out.println("Number is Even");
			} else {
				System.out.println("Number is Odd");

			}
			break; // if this break is not used programm will go in infinite loop
		}

	}

}
