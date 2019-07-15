package Listners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({ListnerDemo.class})
public class TestCases {
	@Test
	public void m1() {
		System.out.println("m1 output");
	}
	@Test
	private void m2() {
		// TODO Auto-generated method stub

	}
	@Test
	private void m3() {
		// TODO Auto-generated method stub

	}
	

}
