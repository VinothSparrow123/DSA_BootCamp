package Recursion_Sort;

public class BubbleSort {
	public static void main(String[] args) {
		
		
	}
	
	public static void bubbleRecursion(int[] arr, int i, int j) {
		
		if(i == arr.length) {
			return;
		}
		
		if(arr[i] > arr[j]) {
			swap(arr, i, j);
		}
		
		bubbleRecursion(arr, i+1, j+1);
	}
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
