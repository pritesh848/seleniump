
public class OddNumbers {

	public static void main(String[] args) {
		int p[] = { 8, 6, 9, 3, 15, 85, 67, 97, 56, 44, 87, 91, 98, 101, 421, 987 };
		System.out.println("Odd Numbers are");
		for (int i = 0; i < p.length; i++) {
			if (p[i] % 2 != 0) {
				System.out.print(p[i] + " ");
			}
		}

	}

}
