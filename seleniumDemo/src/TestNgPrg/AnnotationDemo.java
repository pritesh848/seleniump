package TestNgPrg;

import org.apache.http.util.Asserts;
import org.testng.Assert;	

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AnnotationDemo {
	
	@Test()
	private void m1() {
		SoftAssert sf = new SoftAssert();
		sf.assertEquals("True", "true");
		System.out.println("executing m1");
	
	}

	@Test(enabled = true, dependsOnMethods = ("m3"), invocationCount = 3)
	public void m2() {
		System.out.println("executing m2");

	}

	@Test
	public void m3() {
		System.out.println("executing m3");
	}
}
