package overloading;

public class OverloadingDemo1 {
	/**
	 * this method returns addition of a and b 
	 * @param a
	 * @param b
	 * @return int
	 */
	
   public int  add(int a, int b) {
	System.out.println(a+b);
	return a+b;

}
   private void add(int b, int a,int y) {
	System.out.println(b*a*y);

}
	public static void main(String[] args) {
		OverloadingDemo1 sd= new OverloadingDemo1();
		sd.add(5, 7);
		sd.add(4, 4, 7);

	}

}
