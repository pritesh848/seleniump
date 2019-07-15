package Throw;


public class ExceptionDemo {
	public static  int add(int s , int y) {
		int result = 0;
	try{
	    result = s/0;
		int a =10;
		int b;
		//int n=args.length;
		b=a/0;
	}
	catch(Exception e){
		System.out.println("in try block");
		
	}
	return result;
		
		
	}
public static void main(String[] args) {
	
	System.out.println(add(5, 4));
	
}
}
