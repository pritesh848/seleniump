package polymorphism;

//method overloading
//same method name with different pareter or number of para. or sequence or type
public class Test1 {
	int a;
	String s;

	void show(String s) {

		this.s = s;
		System.out.println("m1 " + s);

	}

	void show(int a) {
		this.a = a;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Test1 yu = new Test1();
		yu.show("pritesh");
		Test1 uy = new Test1();
		uy.show(545245);
		Test1 uu = new Test1();
		uu.show(545);

	}

}
