import java.util.Arrays;

public class DuplicateArraySort {

	public static void main(String[] args) {
		int numbres[] = { 8, 6, 7, 8, 4, 9, 6, 3, 4, 7, 8, 2, 5, 47, 41, 47, 59, 51, 56, 32 };

		System.out.println(numbres.length);
		int c = 0;
		int x = 0;
		Arrays.sort(numbres);
		for (int i = 0; i < numbres.length - 1; i++) {
			// p=numbres[i];
			if (numbres[i] == numbres[i + 1]) {
				continue;
			} else {
				c++;
			}

		}
		int dest[] = new int[c + 1];

		for (int i = 0; i < numbres.length - 1; i++) {

			if (numbres[i] == numbres[i + 1]) {
				continue;
			} else {
				dest[x] = numbres[i];
				dest[x + 1] = numbres[i + 1];
				x++;
			}

		}
		for (int i : dest) {
			System.out.print(i + " ");
		}
	}

}
