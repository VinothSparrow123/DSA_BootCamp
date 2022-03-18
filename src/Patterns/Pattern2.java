package Patterns;

public class Pattern2 {
	/*
	 * Pattern:
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 * 
	 * 
	 * Approach:
	 * 
	 * 1. Identify the number of lines = no of rows
	 * 2. a) Identify the number of columns
	 * 	  b) Type of elements in the column
	 * 3. What do you need to print
	 */
	
	public static void main(String[] args) {
		pattern1(4);
	}
	
	public static void pattern1(int n) {
		
		for (int row = 1; row <= n; row++) {
			
			//For every row run the column
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			
			//when one row is printed add a new line
			System.out.println();
		}
		
	}
}
