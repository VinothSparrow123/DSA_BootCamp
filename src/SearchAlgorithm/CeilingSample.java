package SearchAlgorithm;

public class CeilingSample {
	public static void main(String[] args) {

		int[] arr = { 2, 5, 7, 13, 15, 19, 21, 25, 26, 29, 58, 69, 98, 101 };
		int target = 21;
		System.out.println(ceilingNumber(arr, target));
	}

	private static int ceilingNumber(int[] arr, int target) {
		
	
		int start =0;
		int end = arr.length-1;

		if(target > arr[end]) return -1;
		
		while(start <= end) {
			
			int mid = start + (end -start)/2;
			
			if(arr[mid] == target) {
				return mid;
			} else  if(arr[mid] < target) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		
		return start;
	}
}
