package Practice;

public class findMaxProduct {
	//Find the maximum product of two integers in an array
	
	public static void main(String[] args) {
//		int[] input = {3, 4, 5, 1, 2, 9};
		int[] input = {3, 4, 5, 1, 2, 9, -29, -29};
		System.out.println(findMaxProduct(input));
	}
	

	private static int findMaxProduct(int[] input) {

		int max = Integer.MIN_VALUE;int secondMax = Integer.MIN_VALUE;
		
		for (int i = 0; i < input.length; i++) {
			input[i] = Math.abs(input[i]);
			if(input[i] > max) {
				secondMax = max;
				max = input[i];
			}else if(input[i] > secondMax && input[i] <= max) {
				secondMax = input[i];
			}
		}
		
		return max*secondMax;
	}
}
