package SearchAlgorithm;

public class FindInMountainArray {
	//https://leetcode.com/problems/find-in-mountain-array/
	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 13, 15, 19, 21, 25, 26, 29, 69, 98, 101, 99, 89, 78, 77, 58, 56 };
		int target = 7;
		System.out.println(findInMountainArray(target, arr));
	}
	
	public static int findInMountainArray(int target, int[] mountainArr) {
        //Pseudo Code
        //1. Find the peak element. Array until the peak element is Ascending. Rest is descending
        //2. Apply binary search to find target in Ascending array
        //3. If no element found, apply binary search to find target in descending array
        
        int start =0; int end=mountainArr.length-1;
        
        while(start < end){
            int mid = start + (end-start)/2;
            if(mountainArr[mid] > mountainArr[mid+1]){
                end=mid;
            }else{
                start= mid+1;
            }
        }
        
        int firstTry=binarySearch(0, start, target, mountainArr, true);
        if(firstTry == -1){
            return binarySearch(start+1, mountainArr.length-1, target, mountainArr, false);
        }else return firstTry;
    }
    
    public static int binarySearch(int start, int end, int target, int[] arr, boolean isAsc){
        while (start <= end){
            int mid = start + (end-start)/2;
        
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] > target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(arr[mid] < target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }return -1;
    }
}
