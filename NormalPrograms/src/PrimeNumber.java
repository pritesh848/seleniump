
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean setval = false;
		int n = 8;
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
				if (sum > n) {
					setval = false;
					break;
				} else if (sum == n) {
					setval = true;
					break;
				}
			}
		}
		if(setval)
		{
			System.out.println("Your number is Perfect Number");
		}
		else {
			System.out.println("Your number is not a Perfect Number");
		}
		
	}

}
