package SearchAlgorithm;

import java.util.Arrays;

public class SearchInA2DArray {
	public static void main(String[] args) {
		int[][] matrix= {
				{10, 20, 30, 40},
				{15, 25, 35, 45},
				{28, 29, 37, 49},
				{33, 34, 38, 50}
		};
		int target = 90;
		System.out.println(Arrays.toString(searchInMatrix(matrix, target)));
	}
	public static int[] searchInMatrix(int[][] matrix, int target) {
		int r=0;
		int c=matrix.length-1;
		
		while(r<matrix.length && c>=0) {
			if(matrix[r][c] == target) return new int[] {r,c};
			else if(matrix[r][c] > target) c--;
			else r++;
		}
		return new int[] {-1,-1};
	}
}
