
	import java.io.*;
	import java.math.*;
	import java.text.*;
	import java.util.*;
	import java.util.regex.*;

	public class ArrayinputByScannerAndAddAll {

	    /*
	     * Complete the simpleArraySum function below.
	     */
	    static int simpleArraySum(int[] ar) {
	       int p = 0;
	       for(int i=0;i<=ar.length-1;i++){
	           p=p+ar[i];
	           
	       }
		return p;
	    }

	  

	    public static void main(String[] args) throws IOException {
	    	Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the length of the array:");
	        int length = sc.nextInt();
	        System.out.println("Enter the array array element :");

        int[] ar=  new int[length];
        for (int i = 0; i < ar.length; i++) {
			ar[i]= sc.nextInt();
		}
	  System.out.println(simpleArraySum(ar));

	       
	    }
	}


