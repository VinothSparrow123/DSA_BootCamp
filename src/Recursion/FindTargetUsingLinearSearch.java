package Recursion;

import java.util.ArrayList;
import java.util.List;

public class FindTargetUsingLinearSearch {
	public static void main(String[] args) {
		int[] arr= {2, 45, 34, 12, 9,10, 9 ,9 ,9 , 99};
		//List<Integer> outpur = new ArrayList<>();
 		System.out.println(linearSearchRecursionWOListArg(arr, 9, 0));
	}
	
	static int linearSearchRecursion(int[] arr, int target, int index) {
		
		if(index == arr.length) {
			return -1;
		}
		if(arr[index] == target) return index;
		
		return linearSearchRecursion(arr, target, index+1);
	}
	
	static boolean linearSearchRecursionBool(int[] arr, int target, int index) {
		
		if(index == arr.length) {
			return false;
		}
		
		return arr[index] == target || linearSearchRecursionBool(arr, target, index+1);
	}
	
	static List<Integer> linearSearchRecursion(int[] arr, int target, int index, List<Integer> output) {
		
		if(index == arr.length) {
			return output;
		}
		if(arr[index] == target) output.add(index);
		
		return linearSearchRecursion(arr, target, index+1, output);
	}
	
	static List<Integer> linearSearchRecursionWOListArg(int[] arr, int target, int index) {
	
		List<Integer> list = new ArrayList<>();
	
		if(index == arr.length) {
			return list;
		}
		
		//this will contain the answer for the particular functiona call
		if(arr[index] == target) 
			list.add(index);
		
		List<Integer> ansFromBelowCalls = linearSearchRecursionWOListArg(arr, target, index+1);
		
		//Adding the each function call output to the list while emptying the stack
		list.addAll(ansFromBelowCalls);
		
		return list;
	}
}
