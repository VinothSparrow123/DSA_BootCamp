package SearchAlgorithm;

public class BinarySearch {
	public static void main(String[] args) {
		int[] input = {1,2,4,5,6,7,8,10,11,29,34,35,45,47};
		int target = 1;
		System.out.println(binarySearch(input, target));
	}
	
	/* Pseudo Code
	 * 
	 * Define the start and end points
	 * Find out the mid point
	 * Perform check
	 * 		if target < mid -> change the end element to mid-1
	 * 		if target > mid -> change the start element to mid+1
	 * 		if target == mid -> return the mid
	 * 		
	 * 		if no element is available, return -1
	 */
	
	static int binarySearch(int[] input, int target) {
		
		int start = 0;
		if(input[start] > target) {
			return -1;
		}
		int end = input.length-1;
//		int mid = (start + end)/2; //At some point, (Start+ end) value can exceed the capacity of integer limit
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if(input[mid] > target) {
				end = mid-1;
			}else if(input[mid] < target) {
				start = mid+1;
			}else {
				return mid;
			}
		}
		
		return -1;
	}
}
