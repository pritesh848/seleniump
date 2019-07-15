
public class FindPrimeNumbers {

	public static void main(String[] args) {
		int p[] = { 8, 6, 3, 7, 9, 11, 23, 57, 53, 41, 56, 85, 101 };
		System.out.println("Prime Numbers are");
		for (int i = 0; i < p.length; i++) {
			if (p[i] % 2 == 0 || p[i] % 3 == 0 || p[i] % 5 == 0) {
				if (p[i] == 2 || p[i] == 3 || p[i] == 5) {
					System.out.print(p[i]+" ");
				}
			} else {
				System.out.print(p[i]+" ");
			}
		}

	}

}
