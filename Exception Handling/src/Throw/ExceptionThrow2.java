package Throw;

public class ExceptionThrow2  {

	public static void main(String[] args) {

		ExceptionThrowDemo k = new ExceptionThrowDemo();
		try {
			k.add(200);
		}
		catch(ArithmeticException e)
		{
			System.err.println("Sorry You are not eligible to vote");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Age not valid");
		}

	}
}
