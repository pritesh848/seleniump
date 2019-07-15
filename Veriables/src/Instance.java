
public class Instance {

	static int z = 30;
	 static int x = 10; // Instance Variable

	public void m1() {
		int y = 20; // Local variable
	}

	public static void main(String[] args) {
		Instance t1 = new Instance();
		Instance t2 = new Instance();
		System.out.println(x);
		System.out.println(t1.x);
		System.out.println(Instance.z);
		System.out.println(z);
	}
}
