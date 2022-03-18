package BubbleSort;

import java.util.Arrays;
import java.util.Iterator;

public class BubbleSort {
	public static void main(String[] args) {
		//int[] input = {2, 5, 1, 2, 9};
		int[] input = {-9, 0, 8, -90, 7};
		//int[] input = {1,2,3,4,5,7,8,9};
		bubbleSortKunal(input);
		System.out.println(Arrays.toString(input));
	}

	public static void bubbleSort(int[] input) {
		int count = 0;
		for (int i = input.length - 1; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (input[j] < input[j - 1]) {
					int temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
					count++;
				}
			}
			if (count == 0)
				break;
		}

	}
	
	public static void bubbleSortKunal(int[] input) {
		boolean swapped= false;
		for (int i = 0;i<input.length;i++) {
			for (int j = 1; j <input.length - i; j++) {
				if (input[j] < input[j - 1]) {
					int temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}

	}

}
