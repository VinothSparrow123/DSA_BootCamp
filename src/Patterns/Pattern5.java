package Patterns;

public class Pattern5 {
	/*
	 * Pattern: ***** **** *** ** *
	 * 
	 * 
	 * Approach:
	 * 
	 * 1. Identify the number of lines = no of rows 2. a) Identify the number of
	 * columns b) Type of elements in the column 3. What do you need to print
	 */

	public static void main(String[] args) {
		pattern17(5);
	}

	public static void pattern2(int n) {

		for (int row = 0; row < 2 * n; row++) {

			// For every row run the column
			// int i=1;
			int totalNoOfColumns = row > n ? 2 * n - row : row;
			for (int col = 0; col < totalNoOfColumns; col++) {
				System.out.print("*");
			}

			// when one row is printed add a new line
			System.out.println();
		}
	}

	public static void pattern28(int n) {

		for (int row = 0; row < 2 * n; row++) {

			// For every row run the column
			// int i=1;
			int totalNoOfColumns = row > n ? 2 * n - row : row;

			int numberOfSpaces = n - totalNoOfColumns;

			for (int i = 0; i < numberOfSpaces; i++) {
				System.out.print(" ");
			}

			for (int col = 0; col < totalNoOfColumns; col++) {
				System.out.print("*");
			}

			// when one row is printed add a new line
			System.out.println();
		}
	}
	
	public static void pattern30(int n) {

		for (int row = 1; row <= n; row++) {

			int numberOfSpaces = n - row;

			for (int i = 0; i < numberOfSpaces; i++) {
				System.out.print(" ");
			}

			for (int col = row; col >= 1 ; col--) {
				System.out.print(row);
			}
			
			for (int col = 2; col <= row ; col++) {
				System.out.print(col);
			}

			// when one row is printed add a new line
			System.out.println();
		}
	}
	
	public static void pattern17(int n) {

		for (int row = 1; row <=2 * n; row++) {
			
			int c=row > n ? 2 * n - row : row;

			int numberOfSpaces = n - c;

			for (int i = 0; i < numberOfSpaces; i++) {
				System.out.print(" ");
			}

			for (int col = c; col >= 1 ; col--) {
				System.out.print(col);
			}
			
			for (int col = 2; col <= c ; col++) {
				System.out.print(col);
			}

			// when one row is printed add a new line
			System.out.println();
		}
	}
}
