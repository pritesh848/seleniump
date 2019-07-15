package inheritance;

public class Child extends Parent {
	public int eat(int a, int b) {
		// System.out.println(super.eat(a, b));
		System.out.println("child class output ");
		return a + b;

	}

	protected void testing() {
		
//		 super.eat();
//		//int d = a + b;
//		System.out.println("child output ");
//		 System.out.println("Child class output "+"saug");

	}
	public static void main(String[] args) {
		Parent ch = new Child();
		Child ck = new Child();
		ck.eat(4, 8);
	//	System.out.println(ck.eat(4, 12));

		ch.eat(4, 7);

	}
}
