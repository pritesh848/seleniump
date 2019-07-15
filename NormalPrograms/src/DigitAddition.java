import java.util.Scanner;

public class DigitAddition {
	public static void main(String[] args) {
		
		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		
		System.out.println("Enter"+ num1 +" numbers");
		int a[] =new int [num1];
		
		for (int i =0; i <a.length; i++) {
		    a[i]=sc.nextInt();
		}
		
		//int num[]= {54,65,64,12,55,44,88,116};
		
		
		int sum[]=new int[a.length];
	//	int temp[]=new int[num.length];
		int rem=0;
		System.out.println("numbers with digit addition even are ");
		for (int j = 0; j < a.length; j++) {
			int tmo=a[j];
		
		while(a[j]>0) {
			rem=a[j]%10;
			sum[j]=rem+sum[j];
			a[j]=a[j]/10;
		}	
		//System.out.print(sum[j]+" ");   //to print addition of all digits
	//	temp[j]=sum[j];
		//System.out.println();
		if(sum[j]%2==0) {
			
			System.out.println(" "+tmo+" ");
		}
				
	}
		
}
}