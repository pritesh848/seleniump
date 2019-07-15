
public class MethodCall {
	public int mum(int s, int u) {
		int x = s * u;
		return x;
	}

	public static int num(int a, int b) {
		int x = a + b;
		return x;
	}

	public void eat() {
		System.out.println("i am eating ");

	}

	public static void main(String[] args) {

		MethodCall me = new MethodCall();
		me.eat();
		System.out.println(me.num(5, 7));
		me.num(5, 7);
		System.out.println(me.mum(4, 5));
		System.out.println(num(2, 9));
	}

}
