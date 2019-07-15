
public class LongestArray {
	/**
	 * 
	 * 
	 * @param p
	 * @return maximum value of an array
	 */
	public static int allLongestStrings(int[] p) {
		int max = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] > max) {
				max = p[i];
			}
			// System.out.println(max);
		}
		return max;

	}

	public static void main(String[] args) {
		String[] inputarray = { "hdbcgd", "bvxgsj", "nxbxjsk", "bcgdk", "bchdjsk" };
		int[] newarr = new int[inputarray.length];
		for (int i = 0; i < newarr.length; i++) {
			newarr[i] = inputarray[i].length();
		}
		System.out.println(allLongestStrings(newarr));
	}

}
