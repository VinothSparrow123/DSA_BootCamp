package SearchAlgorithm;

public class RotatedSortedArrayBoolean {
	public static void main(String[] args) {
		int[] arr = {2,5,6,0,0,1,2};
		int target = 0;
		System.out.println(search(arr,target));
	}
	public static boolean search(int[] nums, int target) {
        //Binary Search
        /*
        Here we have 2 sorted arrays considering the pivot point
        
        1. We need to find out the pivot point
        2. Apply binary search from 0 to Pivot -> If element is available, 
                Yes -> return true
                No -> Apply binary search from pivot to end. If element is available, return true, else false
                
        */
        int pivot = findPivot(nums);
        if(pivot==-1){
            //Given array is not a rotated array, so apply binary search directly
            return binarySearch(nums,target,0,nums.length);
        }
        if(nums[pivot] == target){
            return true;
        }
        if(nums[0] <= target){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length);
    }
    
    public static int findPivot(int[] nums){
        int start=0;
        int end= nums.length-1;
        while(start < end){
            int mid=start+ (end-start)/2;
            /*Case to find the pivot:
            1. nums[mid] > nums[mid+1]
            2. nums[mid] < nums[mid-1]
            3. nums[start]==nums[mid] && nums[end]==nums[mid] -> need to skip one element from each direction after the check
                nums[start] > nums[start+1] return start;
                start++;
                nums[end] < nums[end-1] return end-1;
                end++;
            */
            if(mid<end && nums[mid] > nums[mid+1]) return mid;
            if(mid>start && nums[mid] < nums[mid-1]) return mid-1;
            if(nums[start]==nums[mid] && nums[end]==nums[mid]){
                if(nums[start] > nums[start+1])  return start;
                start++;
                if(nums[end] < nums[end-1]) return end-1;
                end--;
            }if(nums[start] > nums[mid] || (nums[mid] ==nums[start] && nums[mid] < nums[end])){
                end=end-1;
            }else{
                start=start+1;
            }
        }
        return -1;
    }
    
    public static boolean binarySearch(int[] nums, int target, int start, int end){
        while(start<=end) {
    		int mid=start+(end-start)/2;
    		if(start<end && target < nums[mid]) {
                end = mid - 1;
            }else if(start<end && target > nums[mid]) {
                start = mid + 1;
            }else{
                return true;
            }
    	}
        
        return false;
    }
}
