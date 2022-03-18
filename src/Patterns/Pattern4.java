package Patterns;

public class Pattern4 {
	/*
	 * Pattern:
	 * *****
	 * ****
	 * ***
	 * **
	 * *
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
		pattern2(5);
	}
	
	public static void pattern2(int n) {
		
		for (int row = 1; row <= n; row++) {
			
			//For every row run the column
			//int i=1;
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			
			//when one row is printed add a new line
			System.out.println();
		}
		
	}
}
