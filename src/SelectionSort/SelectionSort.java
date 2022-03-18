package SelectionSort;

import java.util.Arrays;
import java.util.Iterator;

public class SelectionSort {
	public static void main(String[] args) {
		//int[] input = {2, 5, 1, 2, 9};
		//int[] input = {-9, 0, 8, -90, 7};
		//int[] input = {1,2,3,4,5,7,8,9};
		int[] input = {3,1,2,4,9};
		selectionSort(input);
		System.out.println(Arrays.toString(input));
	}
	
	public static void selectionSort(int[] input) {
		for (int i = 0;i<input.length;i++) {
			
			//Find out the max from the remaining array and swap it
			int last = input.length-i-1;
			int max = getMaxIndex(input, 0, last);
			
			int temp = input[max];
			input[max] = input[last];
			input[last] = temp;
		}

	}

	private static int getMaxIndex(int[] input, int start, int last) {
		int max=start;
		
		for (int i = 0; i <= last; i++) {
			if(input[i] > input[max])
				max = i;
		}
		
		return max;
	}

}
