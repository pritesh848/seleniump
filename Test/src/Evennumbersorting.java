
public class Evennumbersorting {
	public static void main(String[] args) {
		int u = 0;
		int count = 0;
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int b[] = { 6 };
		int[] k = new int[count];
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				k[count]=a[i];
				count++;
			}
		}
		for (int j = 0; j < b.length; j++) {
			if (b[j] % 2 == 0) {
				k[count]=b[j];
				count++;
			}
		}
		// Finding no of evens upto here
		// Making array of no of evens
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
			}
		}
		for (int j = 0; j < b.length; j++) {
			if (b[j] % 2 == 0) {
			}
		}
		for (int g : k) {
			System.out.print(g + " ");
		}
	}
}
