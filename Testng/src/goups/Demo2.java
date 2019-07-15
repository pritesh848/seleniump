package goups;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Demo2 {

	// public static void main(String[] args) {
    @Test(groups = {"g1"})
	public void m11() {
    	System.out.println("m11");

	}
    @Test(groups = {"g2"})
	public void m12() {
    	System.out.println("m12");


	}
    @Test(groups = {"g1"})
	public void m13() {
    	System.out.println("m13");


	}
    @Test(groups = {"g2"})
	public void m14() {
    	System.out.println("m4");


	}
    @Test(groups = {"g1"})
	public void m15() {
    	System.out.println("m15");

	}
    @Test(groups = {"g2"})
	public void m16() {
    	System.out.println("m16");


	}

}
