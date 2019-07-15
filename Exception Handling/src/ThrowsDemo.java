/*throws make suppress execution here in ThrowsDemo2 exception forwarded to third , in third it was handled using try catch and in 3 program 
 * is not abnormaly terminated
 * 
 */
public class ThrowsDemo {
	public static  void m1() throws Exception {
		System.out.println("m1 output ");
	}

	public static void main(String[] args) throws Exception  {
			m1();
		
	
}
}
