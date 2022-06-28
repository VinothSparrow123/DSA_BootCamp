package Patterns;

public class Pattern1 {
	/*
	 * Pattern:
	 * *****
	 * *****
	 * *****
	 * *****
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
		pattern31(5);
	}
	
	public static void pattern2(int n) {
		
		String str= "";
		
		for (int row = 1; row <= n; row++) {
			
			//For every row run the column
			for (int col = 1; col <= n; col++) {
				System.out.print("*");
			}
			
			//when one row is printed add a new line
			System.out.println();
		}
		
	}
	
public static void pattern31(int n) {
		
		for (int row = 1; row <= 2 * n - 1; row++) {
			
			//For every row run the column
			for (int col = 1; col <=  2 * n - 1; col++) {
				int atEachIndex =n - Math.min(Math.min(row, col), Math.min(2*n-row, 2*n - col));
				System.out.print(atEachIndex);
			}
			
			//when one row is printed add a new line
			System.out.println();
		}
		
	}
}
