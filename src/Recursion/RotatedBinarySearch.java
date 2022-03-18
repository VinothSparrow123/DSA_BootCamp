package Recursion;

import java.nio.charset.CodingErrorAction;

public class RotatedBinarySearch {
	public static void main(String[] args) {
		int[] array= {5,6,7,8,9, 10,2,4,4};
		System.out.println(rotatedBinSearch(array, 0, 0, array.length-1));
	}
	
	static int rotatedBinSearch(int[] array,int target, int s, int e) {
		
		if(s>e) 
			return -1;
		
		int mid=s+(e-s)/2;
		
		if(array[mid] == target)
			return mid;
		
		if(array[s] <= array[mid]) {
			if(target >= array[s] && target <= array[mid]) {
				return rotatedBinSearch(array, target, s, mid-1);
			}else
				return rotatedBinSearch(array, target, mid+1, e);
		}
		if(target >= array[mid] && target <= array[e]) {
			return rotatedBinSearch(array, target, mid+1, e);
		}else {
			return rotatedBinSearch(array, target, s, mid-1);
		}
		
	}
	
}
