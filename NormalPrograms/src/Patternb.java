
public class Patternb {

	public static void main(String[] args) {
		int num = 1;
		for (int i = 0; i <= 4; i++) {
			for (int space = 3; space >= i; space--) {
				System.out.print(" ");
			}
			for (int j = 0; j <=i; j++) {
				System.out.print(num+" ");
				num++;
				
			}
			System.out.println();
			
		}

	}

}
