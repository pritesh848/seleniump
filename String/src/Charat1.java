import java.util.Scanner;

public class Charat1 {
public static void main(String [] args) 
{
	System.out.println("Enter the string of character");
	Scanner sc = new Scanner(System.in);
	
	String scr = sc.next();
	System.out.println("original string is = "+ scr);
	System.out.println("enter index1 value");
	char index1  = scr.charAt(sc.nextInt());
	System.out.println("enter second character");
	
	int index2 = scr.charAt(sc.nextInt());
	
	
	System.out.println("character at entered index1 is ");
	System.out.println(index1);
	System.out.println("character at entered index2 is ");
	System.out.println(index2);
}	


}
