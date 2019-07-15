//find even elements in given array
public class FindEvenElement {

	public static void main(String[] args) {

		int[] numbers = { 6, 8, 5, 6, 78, 52, 85, 69, 53, 54, 64, 62, 61 };
		System.out.println("Even Numbers are");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.print(numbers[i] + " ");
			}
		}

	}

}
