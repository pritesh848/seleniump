package goups;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterP {
	@Parameters({"name" , "age"})
	@Test
	public void Try(String name, String age){
		System.out.println("name :"+name);
		System.out.println("age :"+age);
	}
}
