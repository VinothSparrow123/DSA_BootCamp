package SelectionSort;

import java.util.HashMap;
import java.util.Map;

public class findRepNumbers {
	public static void main(String[] args) {
		int[] input = {'7','7','0','8','3','0','1','3','9','1'};
		repNumbers(input);
		
	}
	
	public static void repNumbers(int[] input) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < input.length; i++) {
			map.getOrDefault(input[i], map.put(input[i], 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> eachEntry:map.entrySet()) {
			if(eachEntry.getValue() > 1) {
				System.out.println(eachEntry.getKey());
			}
		}
		
	}
}
