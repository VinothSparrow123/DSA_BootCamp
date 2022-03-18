package SearchAlgorithm;

public class RotatedSortedArray {
	
	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 7, 7, 13, 15, 19, 19, 19, 21, 25, 26, 29, -10,-8, -5, 0, 1};
		int target = 21;
		System.out.println(search(arr, target));
	}

	public static int search(int[] nums, int target) {

		/*
		 * Pseudo Code
		 * 
		 * a) Find the pivot 
		 * b) search in the array (start to pivot) 
		 * c) search in the array (pivot+1 to end)
		 */
		
//		int pivot = findPivot(nums);
		int pivot = findPivotDuplicates(nums);
		
		if(pivot ==-1) {
			//it is not a rotated array, just a normal sorted array. So apply normal binary search
			return binarySearch(0, nums.length-1, target, nums);
		}
		
		//If not, look for a possible cases
		/*
		 * case 1: if pivot = target, return pivot
		 * case 2: if start > target, set start = pivot+1 (because from start to Pivor all the elements are greater than target)
		 * case 3: if start < target, set end = pivot-1 (because target going to lie between start and pivot)
		 */
		
		if(nums[pivot] == target) return pivot;
		if(nums[0] <= target) {
			return binarySearch(0, pivot-1, target, nums);
		}
		return binarySearch(pivot+1, nums.length-1, target, nums);
	}
	
	static int findPivot(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			/* Cases to find the pivot number
			 * 
			 * case 1: when mid value is greater than mid+1, mid will be a pivot
			 * case 2: if mid < mid-1, mid-1 will be a pivot
			 * case 3: if mid > start -> start=mid+1
			 * case 4: if mid < start -> end = mid-1 
			 * 
			 */
			if (mid < end && nums[mid] > nums[mid + 1]) {
				return mid;
			}
			if(mid > start && nums[mid] < nums[mid-1]) {
				return mid-1;
			}
			if(nums[start] <= nums[mid]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
	}
	
	static int findPivotDuplicates(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			/* Cases to find the pivot number
			 * 
			 * case 1: when mid value is greater than mid+1, mid will be a pivot
			 * case 2: if mid < mid-1, mid-1 will be a pivot
			 * case 3: if mid > start -> start=mid+1
			 * case 4: if mid < start -> end = mid-1 
			 * 
			 */
			if (mid < end && nums[mid] > nums[mid + 1]) {
				return mid;
			}
			if(mid > start && nums[mid] < nums[mid-1]) {
				return mid-1;
			}
			
			//if start, end and mid elements are equal means, skip one element from each end after checking
			if(nums[mid] == nums[start] && nums[mid] == nums[end]) {
				
				//check before skip, because this could be the pivot element
				if(nums[start] > nums[start+1]) {
					return start;
				}
				//skip one element
				start++;
				
				if(nums[end] < nums[end-1]) {
					return end-1;
				}
				end--;
			}
			//left side is sorted, so pivot would lie in right
			else if(nums[mid] > nums[start] || (nums[mid] == nums[start] && nums[mid] > nums[end])) {
				start = start+1;
			}else {
				end = end-1;
			}
		}
		return -1;
	}

	public static int binarySearch(int start, int end, int target, int[] arr) {
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
		}
		return -1;
	}

}
