
public class Sub {
	public static int doSub(int p) {
      int sub=0;
      int rem=0;
      int pub=0;
      while(p>0) {
    	  rem=p%10;
    	  
    	  
    	  pub=p/10;
    	  sub=rem-pub;
      }
      return sub;
	}
	
	public static void main(String[] args) {
		
		int[] num = {55,69,65,21,36,41,87};
		for (int i = 0; i < num.length; i++) {
			
			System.out.println("Subtraction of number  " +num[i] +" is "+ doSub(num[i]));
		} 
		

	}

	}


