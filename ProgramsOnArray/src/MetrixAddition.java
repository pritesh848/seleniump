import java.util.Scanner;

public class MetrixAddition {
	public static void main(String[] args)

	{
		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		int[][] matrix2 = new int[3][3];
		int[][] add = new int[3][3];
		System.out.println("Enter elements for first matrix");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Enter element no " + i + j);
				matrix[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Enter elements for second matrix");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.println("Enter element no " + i + j);
				matrix2[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Additon of the 2 entered matrix is ");
		for (int i = 0; i < add.length; i++) {
			for (int j = 0; j < add[i].length; j++) {
				add[i][j] = matrix[i][j] + matrix2[i][j];
			}
		}
		for (int i = 0; i < add.length; i++) {
			for (int j = 0; j < add[i].length; j++) {
				System.out.print(add[i][j] + " ");
			}
			System.out.println();
		}

	}
}
