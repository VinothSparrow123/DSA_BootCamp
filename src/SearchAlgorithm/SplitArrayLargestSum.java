package SearchAlgorithm;

public class SplitArrayLargestSum {
	public static void main(String[] args) {
		int[] arr = { 7,2,5,10,8 };
		int m = 2;
		System.out.println(splitArray(arr, m));
	}

	/*
	 * Question: Given an array nums which consists of non-negative integers and an
	 * integer m, you can split the array into m non-empty continuous subarrays.
	 * Write an algorithm to minimize the largest sum among these m subarrays.
	 * 
	 * Example 1: Input: nums = [7,2,5,10,8], m = 2 Output: 18 Explanation: There
	 * are four ways to split nums into two subarrays. The best way is to split it
	 * into [7,2,5] and [10,8], where the largest sum among the two subarrays is
	 * only 18.
	 * 
	 */

	/*
	 * https://leetcode.com/problems/split-array-largest-sum/
	 * 
	 * https://www.youtube.com/watch?v=eEvLI9i02Zw
	 * 
	 * Pseudo Code:
	 * 
	 * 1. Find the boundaries to apply binary search start, end and mid start -> max
	 * element in the array (Because, this is the least number we can get it as a
	 * sum) end -> sum of all the elements in the array (Because this is the maximum
	 * possible sum) Here the output or sum is tracked in the form of boundaries
	 * 
	 * If we can split the array using #2, if (mid > start) -> start=mid+1 else
	 * end=mid-1;
	 * 
	 * 
	 * 2. Check whether the array can be splitted as m arrays using binary search
	 * find the mid value using boundaries add to total until the sum greater than
	 * mid (if(total > mid) -> count++; total = currentElement;) if (count > m)
	 * false;
	 */

	public static int splitArray(int[] nums, int m) {
		int start = nums[0];
		int end = 0;

		for (int i : nums) {
			if (start < i)
				start = i;
			end += i;
		}
		
		while(start < end) {
			int mid=start+(end-start)/2;
			if(canSplitArray(nums, m, mid)) {
				end = mid;
			}
			else start = mid+1;
		}
		return end;

	}

	public static boolean canSplitArray(int[] nums, int m, int mid) {
		int total=0;int count =1;
		for (int i : nums) {
			total += i;
			
			if(total > mid) {
				total = i;
				count++;
			}
			
			if(count >m) {
				return false;
			}
		}
		return true;
	}

}
