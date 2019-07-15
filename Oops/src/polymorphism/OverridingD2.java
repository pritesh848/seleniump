package polymorphism;

public class OverridingD2 extends OverridingDemo {
	 void show() {
		System.out.println("second class");
	}

	public static void main(String[] args) {

		OverridingDemo ns = new OverridingDemo();
		ns.show(5 , 6);
		OverridingD2 nm = new OverridingD2();
		nm.show();
	}

}
