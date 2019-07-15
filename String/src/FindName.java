import java.util.Scanner;

public class FindName {

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("enter array size");
	 
	 int []given= new int [input.nextInt()];
	 //now take array elements
	 System.out.println("enter array element of two digit");
	 for (int i = 0; i < given.length; i++) {
		 
		given [i]=  input.nextInt();
		
	}
	 //show the stored array
    System.out.println("given array is");
    
    for (int i = 0; i < given.length; i++) {
    	
		System.out.print(given[i]+" ");
	}
    //addition of those digit whose digit addition is even
    
    for (int i = 0; i < given.length; i++) {
		
	
    int num=given[i];
    int rem=0;
    int sum[]=new int[given.length];
    while (i>0) {
		rem = num%10;
		sum[i]=sum[i]+rem;
		num=num/10;
		}
    System.out.println("sum of digits is");
   for (int j = 0; j < given.length; j++) {
	System.out.print(sum[i]+" ");
}
   
    
    }
   
    
}
}
