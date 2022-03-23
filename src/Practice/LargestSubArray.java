package Practice;

import java.util.Arrays;

public class LargestSubArray {
	public static void main(String[] args) {
			int[] nums = {7,4,5,2,3,23,9,0,23};
//			int[] nums = {1,4,5,2,3};
//			int[] nums = {1,5};
			int k = 3;
			System.out.println(Arrays.toString(largestSubArray(nums,k)));
		}

	private static int[] largestSubArray(int[] nums, int k) {
		// TODO Auto-generated method stub
		if(k > nums.length) 
			throw new RuntimeException("K value is greater than the provided array length");
		
		int start = 0; int end=k-1; int max=0;		
		for (int i = 0; i < k; i++) {
			max += nums[i];
		}
		int currMax=0;
		for (int i = k; i < nums.length; i++) {
			currMax = max + nums[i]-nums[i-k];
			if(max < currMax) {
				max = currMax;
				start = i-k+1;
				end=i;
			}
		}
		
		return Arrays.copyOfRange(nums, start, end+1);
	}
}
