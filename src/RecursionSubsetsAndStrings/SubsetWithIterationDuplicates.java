package RecursionSubsetsAndStrings;

import java.util.ArrayList;
import java.util.List;

public class SubsetWithIterationDuplicates {
	public static void main(String[] args) {
		int[] array = {1,2,2,2};
		List<List<Integer>> ans = subsetIteration(array);
		
		for (int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}
	
	/*
	 * When u find a duplicate element, only add it to the newly created subset of previous step
	 * 
	 * Because of above point duplicates should be next to each other. Hence sort the array before start to operate
	 * 
	 */
	public static List<List<Integer>> subsetIteration(int[] array) {
		List<List<Integer>> outer = new ArrayList<>();
		
		outer.add(new ArrayList<>());
		int start=0;
		int end = 0;
		
		for (int i = 0; i < array.length; i++) {
			int n=outer.size();

			if(i>0 && array[i] == array[i-1]) {
				start=end+1;
			}
			end=outer.size()-1;
			for (int j = start; j < n; j++) {
				List<Integer> inner = new ArrayList<>(outer.get(j));
				inner.add(array[i]);
				outer.add(inner);
			}
		}
		
		return outer;
	}
}
