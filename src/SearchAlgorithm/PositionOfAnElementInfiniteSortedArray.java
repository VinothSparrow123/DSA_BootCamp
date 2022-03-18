package SearchAlgorithm;

public class PositionOfAnElementInfiniteSortedArray {
	
	public static void main(String[] args) {
		
		int[] arr = { 2, 5, 7, 13, 15, 19, 21, 25, 26, 29, 58, 69, 98, 101 };
		int target = 2;
		System.out.println(findingStartEnd(arr, target));
		
	}
	
	/*Pseudo Code
	 * 
	 * As its an infinite array we cannot use length property
	 * We should move as a chunk (like, take first element apply binary seach, then increase the search area apply binary search)
	 * Use the reversal approach of binary search (LogN, ..., N/2, N)
	 * 
	 * decide start, end
	 * check target if (target >= start & target <= end)
	 * 		Yes -> Apply binary search within this range'
	 * 		No -> set start=end+1, end=2*end
	 * 
	 */
	
	static int findingStartEnd(int[] arr, int target) {
		int start=0;
		int end=1;
		
		while(target > arr[end]) {
			
			int temp=end+1; //new start
			//double the box value
			//end = old end + (size of the previous box * 2)
			end = end + (end-start+1)  *2 ;
			start = temp;
		}
		
		return positionOfAnElement(arr, target, start, end);
	}

	private static int positionOfAnElement(int[] arr, int target, int start, int end) {

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] > target) {
				end = mid - 1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
		
	}
	
}
