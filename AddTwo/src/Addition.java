import java.util.Scanner;

public class Addition {
	public static void main (String [] args)
	{
		Scanner input= new Scanner (System.in);
		System.out.println("enter first number");
		int num1=input.nextInt();
		System.out.println("enter second number");
		int num2=input.nextInt();
		int sum = num1+num2;
		
		System.out.println();
		System.out.println("sum:"+sum );
	}

}
