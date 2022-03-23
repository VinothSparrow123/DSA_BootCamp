package Practice;

import java.util.Arrays;

public class moveZeroesToEnd {
	//Given an array of integers, move all zeros present in the to the end
	
	public static void main(String[] args) {
		int[] input = {1,2,0,0,23,0,0,23,34,32};
		moveZeroesToEnd(input);
		System.out.println(Arrays.toString(input));;
	}

	private static void moveZeroesToEnd(int[] input) {
		
		int i=0;
		for (int j = 0; j < input.length; j++) {
			if(input[j] != 0) {
				input[i] = input[j];
				i++;
			}
		}
		
		for (int j = i; j < input.length; j++) {
			input[j] = 0;
		}
		
	}
}
