package SearchAlgorithm;

public class FloorOfANumber {
	public static void main(String[] args) {
		
		int[] arr = {2,5,7,13,15,19,21,25,26,29,58,69,98,101}; 
		int target = -1;
		System.out.println(ceilingNumber(arr, target));
		
	}
	//floornumber -> Greatest element in an array smaller or equal to target
	
	/* Question:
	 * Find the floor of a given number
	 * arr[] = {2,5,7,13,15,19,21,25,26,29,58,69,98,101}; Target = 7;
	 */
	
	/* Pseudo Code
	 * Find the mid using Binary search
	 * Compare it with Target
	 * 		if mid == target -> return mid
	 * 		if mid > target -> end = mid-1
	 * 		if mid < target -> start = mid+1
	 * 
	 * return end; //as it is lesser than target
	 */
	
	static int ceilingNumber(int[] arr, int target) {
		
		int start=0;int end = arr.length-1;
		
		//if target element is lesser than the smallest elements in the array
		if(arr[start] > target) return -1;
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid] == target) return arr[mid];
			
			if(arr[mid] > target) {
				end = mid-1;
			}
			
			if(arr[mid] < target) {
				start = mid+1;
			}
		}
		
		
		
		return arr[end]; //when condition is violated s=e+1 i.e., e<s
	}
}
