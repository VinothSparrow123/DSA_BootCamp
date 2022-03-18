package SearchAlgorithm;

import java.util.Arrays;

public class SearchInSortedArray {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 } };
		int target = 16;
		System.out.println(Arrays.toString(searchInSortedMatrix(matrix, target)));
	}

	/*
	 * Pseudo Code
	 * 
	 * 1. Try to reduce the search space by using binary search across the rows keeping the constant middle column. Make sure the search
	 * 	  goes until we have only two rows to check at the end (rowStart < roeend-1)
	 * 		Means find the middle element of middle row and compare it with target If
	 * 		case 1: element Equals -> return the answer else -> remove the below rows as it is 
	 * 		case 2: target > mid -> remove the above rows as it is going to lesser than middle
	 * 		case 3: target < mid -> remove the below rows as it is going to lesser than middle
	 * 
	 * 2. Now, try to search in those two rows by considering the mid position
	 * 
	 * 
	 * 
	 * 
	 */
	public static int[] searchInSortedMatrix(int[][] matrix, int target) {
		int rowStart = 0;
		int rowEnd = matrix.length-1;
		int midColumn = matrix[0].length / 2;
		int colEnd = matrix[0].length;
		int colStart = 0;
		
		if (colEnd == 0){
            return new int[] {-1,-1};
        }
		//edge case
		if(rowEnd == 1) {
			return binarySearch(matrix, target, 0, 0, colEnd-1);
		}

		// Run the loop until only two rows are remaining
		while (rowStart < (rowEnd - 1)) {
			int mid = rowStart + (rowEnd - rowStart) / 2;
			if (matrix[mid][midColumn] == target) {
				return new int[] { mid, midColumn };
			}
			if (matrix[mid][midColumn] > target) {
				rowEnd = mid;
			} else {
				rowStart = mid;
			}

		}
		
		//Check the middle column elements are equal to target in those two remaining row		
		if(matrix[rowStart][midColumn] == target) {
			return new int[] {rowStart, midColumn};
		}
		
		if(matrix[rowStart+1][midColumn] == target) {
			return new int[] {rowStart+1, midColumn};
		}
		
		//search in 1st half means first row, beneath the mid mid column
		if(matrix[rowStart][midColumn-1] >= target) {
			return binarySearch(matrix, target, rowStart, 0, midColumn-1);
		}
		
		//2nd half
		if(matrix[rowStart][midColumn+1] <= target && matrix[rowStart][colEnd-1] >= target) {
			return binarySearch(matrix, target, rowStart, midColumn+1, colEnd-1);
		}
		
		//3rd half
		if(matrix[rowStart+1][midColumn-1] >= target) {
			return binarySearch(matrix, target, rowStart+1, 0, midColumn-1);
		}
		
		//4th half
		else {
			return binarySearch(matrix, target, rowStart+1, midColumn+1, colEnd-1);
		}
	}

	public static int[] binarySearch(int[][] matrix, int target, int row, int cStart, int cEnd) {

		while (cStart <= cEnd) {

			int midColumn = cStart + (cEnd - cStart) / 2;

			if (matrix[row][midColumn] == target) {
				return new int[] { row, midColumn };
			}
			if (matrix[row][midColumn] < target) {
				cStart = midColumn + 1;
			} else {
				cEnd = midColumn - 1;
			}

		}
		return new int[] { -1, -1 };
	}

}
