
public class Pattern {

	public static void main(String[] args) {
	//int p = 1;
	int n = 1;
	int i;
	char c = 'a';
	for ( i = 1; i <=3; i++) 
	{
		for (int j = i; j <3; j++) 
		{
			System.out.print(" ");
		}
		
		if(i==1)
		{
			System.out.print(" *");
			System.out.println();
		}
		
		if(i==2) 
		{
			for (int k = 0; k <=2; k++) {
		
			System.out.print(c+" ");
			 c++;
			}
			System.out.println();
		}
		if(i==3) 
		{
			for (int l = 0; l <4 ; l++)
			{
			
			     System.out.print(n+" ");
			      n++;	
			}
			System.out.println();
		}
	 }

	}

}
