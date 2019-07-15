
public class ReverseElements {

	public static void main(String[] args) {
		int u=0;
		int[] l = { 8, 6, 4, 7, 9, 3, 4, 1, 52 };
		int[] n = new int[l.length];
		for (int i = l.length - 1; i >= 0; i--) {
			n[u] = l[i];
			u++;
		}
		for (int x : n) {
			System.out.print(x + " ");
		}
	}

}
