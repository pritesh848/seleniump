import java.util.Scanner;

public class NumberPositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //deciding input data type
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input>0) {
			System.out.println(input + " is positive Number ");
		}
		else {
			System.out.println(input +  " is negative number");
		}
		
		
	}

}
