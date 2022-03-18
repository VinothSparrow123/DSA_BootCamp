package Recursion;


public class FindSortedArrayOrNot {
	
	public static void main(String[] args) {
		int[] array = {2,4,5,5,6,8,10};
		System.out.println(isSorted(array, 0));
	}
	
	public static boolean isSorted(int[] array, int pos) {
		
		if(pos+1 == array.length) {
			return true;
		}
		
		
		return (array[pos] < array[pos+1] || array[pos] == array[pos+1])  && isSorted(array, pos+1);
	}

}
