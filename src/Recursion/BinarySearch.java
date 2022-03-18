package Recursion;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 13, 15, 19, 21, 25, 26, 29, 58, 69, 98, 101 };
		int target = 100;
		System.out.println(binaryReacursion(arr, target, 0, arr.length-1));
	}
	
	static int binaryReacursion(int[] array, int target, int start, int end) {
		
		if (start > end) return -1;
		
		int mid = start + (end-start)/2;
		
		if(array[mid] == target) return mid;
		
		if(array[mid] < target) return binaryReacursion(array, target, mid+1, end);
		
		else return binaryReacursion(array, target, start, mid-1);
	}
}
