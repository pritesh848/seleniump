import java.util.Scanner;

public class MetrixSubstraction {

	public static void main(String[] args)
	{
      Scanner input = new Scanner(System.in);
      int [][] matrix=new int [3][3];
      int [][] matrix2=new int [3][3];
      int [][] sub = new int [3][3];
      System.out.println("Enter the number");
      for (int i = 0; i < matrix.length; i++) {
    	  for (int j = 0; j < matrix.length; j++) {
    		  System.out.println("enter element no." +i +j);
    		  matrix[i][j]=input.nextInt();	
		}
		
	}
      System.out.println("enter element for secont matrix");
      for (int i = 0; i < matrix2.length; i++) {
    	  for (int j = 0; j < matrix2.length; j++) {
			System.out.println("enter element no."+i +j);
	     	matrix2[i][j]=input.nextInt();	     		
		}
	}
      System.out.println("Subtraction of two matrix is");
         for (int i = 0; i < sub.length; i++) {
        	 for (int j = 0; j < sub.length; j++) {
        		 sub[i][j] = matrix[i][j] - matrix2[i][j];	
			}
			
		}
         for (int i = 0; i < sub.length; i++) {
			for (int j = 0; j < sub.length; j++) {
				System.out.print(sub[i][j]+" ");
			}
			System.out.println();
		}
	}

}
