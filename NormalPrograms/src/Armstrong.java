
public class Armstrong {

	public static boolean isArmStrongNumber(int num) {
		int rem = 0;
		int sum = 0;
		int temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if (sum == temp)
			return true;
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			if (isArmStrongNumber(i)) {
				System.out.print(i+" ");
			}
//			else {
//				System.out.println("Number entered is not an armstrong number");
//			}
		}
	}
}