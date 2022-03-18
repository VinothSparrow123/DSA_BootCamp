package Recursion_Pattern;

public class Pattern1 {
	public static void main(String[] args) {
		//pattern(4, 0, 3);
		patternRows(4, 0);
		triangle2(4,0);
	}
	
	public static void pattern(int n, int row, int col) {
		
		if(row >= n)
			return;
		
		for (int i = 0; i < n-row; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		pattern(n, row+1, col-1);
	}
	
	public static void patternRows(int row, int col) {
		
		if(row == 0)
			return;
		
		if(row > col) {
			System.out.print("*");
			patternRows(row, col+1);
		}else {
			System.out.println();
			patternRows(row-1, 0);
		}
		
	}
	
	public static void triangle2(int row, int col) {
		
		if(row == 0)
			return;
		
		if(row > col) {
			patternRows(row, col+1);
			System.out.print("*");
		}else {
			patternRows(row-1, 0);
			System.out.println();
		}
		
	}
}
