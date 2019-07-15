import java.util.Scanner;

public class GrestestNumbers
{

	public static void main(String[] args)
	{
		//take three numbers from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 =sc.nextInt();
		System.out.println("Enter third number");
		int num3 = sc.nextInt();
		//show three numbers
		System.out.println("entered numbers are "+num1+" ,"+num2+" ,"+num3+" ");
		System.out.println("and");
		//comparision
		if(num1>num2) 
		  {
			if(num1>num2) 
			{
				System.out.println(num1+" is greatest number");
			}
		  }	
			if(num2>num3 && num2>num1)
			{
				System.out.println(num2+" is greatest number");
				
			}
			else 
			{
				System.out.println(num3+" is greatest number");
			}
			
    }
	
}

