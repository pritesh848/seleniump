package Throw;

import org.testng.annotations.Test;

public class ExceptionThrowDemo {
	
		
	
	public static void add(int age) {
		try {
			age = age/0;
			
		}catch(Exception e) {
			try {
				throw new AgeNotValidException();
			} catch (AgeNotValidException e1) {
				System.out.println(e1.getMessage());
			}
		}
		finally {
			System.out.println("final code is over");
		}
		
	}
	/*
		if (age < 18)
			throw new ArithmeticException("not valid");
		else if(age > 120)
		{
			throw new AgeNotValidException();
		}
		else {
			System.out.println("welcome to vote");
		}
		System.out.println("all over");
	}
	*/
	public static void main(String[] args) throws AgeNotValidException {
	
	add(13);
	}
}
