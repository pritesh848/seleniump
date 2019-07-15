
public class AdditionMethods {
 
	public static int doAddition(int p) {
		int sum=0;
		while(p>0) {
			sum=p%10+sum;
			p=p/10;
		}
		return sum;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] num = {55,63,65,21,36,41,87};
		for (int i = 0; i < num.length; i++) {
			
			System.out.println("Addition of number  " +num[i] +" is "+ doAddition(num[i]));
		} 
		

	}

}
