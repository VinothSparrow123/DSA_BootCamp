package SearchAlgorithm;

public class OrderAgnosticBinarySearch {
	public static void main(String[] args) {
		int[] input = {1,2,4,5,6,7,8,10,11,29,34,35,45,47};
//		int[] input = { 99,88,7,65,44,33,2,-10,-80 };
		int target = 2;
		System.out.println(orderAgnosticBS(input, target));
	}

	/*
	 * Pseudo Code
	 * 
	 * Define the start and end points Find the mid point Find the given array is
	 * Ascending or Descending if target == mid -> return the mid If it is Ascending
	 * if target < mid -> change the end element to mid-1 if target > mid -> change
	 * the start element to mid+1
	 * 
	 * If it is Descending if target > mid -> change the end element to mid-1 if
	 * target < mid -> change the start element to mid+1
	 * 
	 * if no element is available, return -1
	 */

	static int orderAgnosticBS(int[] input, int target) {

		int start = 0;
		int end = input.length - 1;
//		int mid = (start + end)/2; //At some point, (Start+ end) value can exceed the capacity of integer limit
		boolean isAsc = (input[start] < input[end]);
		while (start <= end) {

			int mid = start + (end - start) / 2;
			
			if(input[mid] == target) return mid;

			if (isAsc) {
				if (input[mid] > target) {
					end = mid - 1;
				} else if (input[mid] < target) {
					start = mid + 1;
				}
			}else {
				if(input[mid] > target) start = mid+1;
				if(input[mid] < target) end = mid-1;
			}
		}

		return -1;
	}
}
