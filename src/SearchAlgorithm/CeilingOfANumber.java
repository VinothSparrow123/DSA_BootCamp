package SearchAlgorithm;

public class CeilingOfANumber {
	public static void main(String[] args) {
		
		int[] arr = {2,5,7,13,15,19,21,25,26,29,58,69,98,101}; 
		int target = 120;
		System.out.println(ceilingNumber(arr, target));
		
	}
	//ceilingNumber -> Smallest element in an array greater or equal to target
	
	/* Question:
	 * Find the ceiling of a number
	 * arr[] = {2,5,7,13,15,19,21,25,26,29,58,69,98,101}; Target = 7;
	 */
	
	/* Pseudo Code
	 * ceilingNumber
	 * Find the mid using Binary search
	 * Compare it with Target
	 * 		if mid == target -> return mid
	 * 		if mid > target -> end = mid-1
	 * 		if mid < target -> start = mid+1
	 * 
	 * return -1;
	 */
	
	static int ceilingNumber(int[] arr, int target) {
//		int ceilingNumber = -1;
		
		int start=0;int end = arr.length-1;
		
		//if given target number is greater than the greatest element in the array
		if(target > arr[end]) return -1;
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid] == target) return arr[mid];
			
			if(arr[mid] > target) {
//				ceilingNumber = arr[mid];
				end = mid-1;
			}
			
			if(arr[mid] < target) {
				start = mid+1;
			}
		}
		
		
		
		return arr[start]; //when breaking the while loop start should be ahead of end means start>end. so we are returning the start
	}
}
