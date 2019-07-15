
public class AdditionOfAllArrayElement {

	public static void main(String[] args)

	{
		int x = 0;
		int[] p = { 1000000001, 1000000002, 1000000003, 1000000004, 1000000005 };
		System.out.println("Addition of all element is ");

		for (int i = 0; i < p.length; i++) {
			x = p[i] + x;
			
		}
		System.out.print(x);

	}

}
