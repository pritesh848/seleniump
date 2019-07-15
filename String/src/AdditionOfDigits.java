
public class AdditionOfDigits {

	public static int doAdditionofDigits(int p) {
		int sum = 0;
		while (p > 0) {
			sum = sum + p % 10;
			p = p / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] num = { 55, 65, 524, 66, 88 };
		for (int i = 0; i < num.length; i++) {
			System.out.println("Addition of the number "+num[i]+" is "+ doAdditionofDigits(num[i]));
		}
//		int sum[] = new int[num.length];
//		for (int i = 0; i < num.length; i++) {
//			int temp = num[i];
//			while (num[i] > 0) {
//				sum[i] = sum[i] + num[i] % 10;
//				num[i] = num[i] / 10;
//			}
//			if (sum[i] % 2 == 0) {
//				System.out.print(temp + " ");
//			}
	}
//		for (int g : sum) {
//			if (g % 2 == 0) {
//				System.out.print(g + " ");
//			}
//		}
}
