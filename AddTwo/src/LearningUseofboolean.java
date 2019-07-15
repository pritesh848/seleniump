import java.util.Scanner;

public class LearningUseofboolean {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a number to find whether it is even or odd");
		int i = inp.nextInt();
		boolean isEven = false;
		if (i % 2 == 0)
			isEven = true;
		if (isEven) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}

	}
}
