package Throws;
public class ThrowDemo3 extends ThrowsDemo2 {
public static void main(String[] args) {
	ThrowsDemo2 j = new ThrowsDemo2();
	try {
		j.m1();
	} catch (Exception e) {
		System.out.println("m3");
		e.printStackTrace();
	}
}
}
