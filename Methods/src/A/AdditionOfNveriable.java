package A;

public class AdditionOfNveriable {
	/** Returns a new String composed of copies of the
	 * 
	 */
	public int Addition(int... a) {
		int result = 0;
		for (int j = 0; j < a.length; j++) {
			result += a[j];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionOfNveriable s = new AdditionOfNveriable();
		System.out.println(s.Addition(10, 20, 30, 40, 50, 54, 87, 65));
		AdditionOfNveriable gh = new AdditionOfNveriable();
		
	}

}
