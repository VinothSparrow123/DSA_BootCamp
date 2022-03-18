package SearchAlgorithm;

public class FirstAndLastPos {
	public static void main(String[] args) {

		int[] arr = { 2, 5, 7, 13, 15, 19, 21, 25, 26, 29, 58, 69, 98, 101 };
		int target = -1;
		System.out.println(searchRange(arr, target));

	}

	// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

	// floornumber -> Greatest element in an array smaller or equal to target

	/*
	 * Question: Find the floor of a given number arr[] =
	 * {2,5,7,13,15,19,21,25,26,29,58,69,98,101}; Target = 7;
	 */

	public static int[] searchRange(int[] nums, int target) {

		/*
		 * Pseudo Code Find first occurance of target when mid = target, navigate to the
		 * left Find the last occurance of target when mid = target, navigate to the
		 * right to find the last occurance Return as an array
		 * 
		 */

		int i = findOccurance(nums, target, true);
		int j = findOccurance(nums, target, false);

		return new int[] { i, j };

	}

	public static int findOccurance(int[] nums, int target, boolean isStartingIndex) {
		int ans = -1;

		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] > target) {
				end = mid - 1;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				ans = mid;
				if (isStartingIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}

		return ans;
	}
}
