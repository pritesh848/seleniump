
public class EvenNumbersortingUsing2D {
	public static void main(String[] args) {
		int u = 0;
		int a[][] = { { 14, 15, 17, 24, 36, 19 }, { 61, 62, 63, 64, 65, 66 } };
		int c[] = new int[a[0].length];
		for (int i = 0; i < a[0].length; i++) {
			if (a[0][i] % 2 == 0) {
				c[u] = a[0][i];
				u++;
			}
		}
		for (int j = 0; j < a[1].length; j++) {
			if (a[1][j] % 2 == 0) {
				c[u] = a[1][j];
				u++;
			}
		}
		for (int g : c) {
			System.out.print(g + " ");
		}

	}
}
