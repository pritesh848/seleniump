import java.util.Scanner;

public class FindFloatingPointNumber 
{

	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
      System.out.println("Input value ");
      double input = sc.nextDouble();
       if (input>0)
       {
    	   if (input<1) 
    	   {
    		System.out.println("positive small number");   
    	   }
    	   else if (input>1000000) 
    	   {
    		  System.out.println("positive large number"); 
    	   }
    	   else
    	   {
    		System.out.println("positive number");   
    	   }
       }
       else if (input<0)
       {
    	   if(Math.abs(input) < 1)
    	   {
    		   System.out.println("Negative small number");
    	   }
    	   else if(Math.abs(input) > 1000000)
    	   {
    		  System.out.println("negative large number");
    	   }
    	   else
    	   {
    		System.out.println("Negative number");   
    	   }
       }
       else
       {
    	System.out.println("zero");   
       }
	}

}
