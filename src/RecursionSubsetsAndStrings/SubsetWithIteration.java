package RecursionSubsetsAndStrings;

import java.util.ArrayList;
import java.util.List;

public class SubsetWithIteration {
	public static void main(String[] args) {
		int[] array = {1,2,3};
		List<List<Integer>> ans = subsetIteration(array);
		
		for (int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}
	
	public static List<List<Integer>> subsetIteration(int[] array) {
		List<List<Integer>> outer = new ArrayList<>();
		
		outer.add(new ArrayList<>());
		
		for (int i = 0; i < array.length; i++) {
//		 	List<Integer> inner = new ArrayList<>();
			int n=outer.size();
			for (int j = 0; j < n; j++) {
				List<Integer> inner = new ArrayList<>(outer.get(j));
				inner.add(array[i]);
				outer.add(inner);
			}
		}
		
		return outer;
	}
}
