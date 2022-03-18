package RecursionSubsetsAndStrings;

import java.util.ArrayList;
import java.util.List;

public class DiceProblem {
	public static void main(String[] args) {
//		getPossibleDice1("",5);
		System.out.println(getPossibleDice("", 4));
	}
	
	public static List<String> getPossibleDice(String p, int target){
		
		if(target == 0) {
			List<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		List<String> list = new ArrayList<>();
		for (int i = 1; i <= 6 && i<= target; i++) {
			list.addAll(getPossibleDice(p+i, target-i));
		}
		
		return list;
	}
	
	public static void getPossibleDice1(String p, int target){
		if(target == 0) {
			System.out.println(p);
			return;
		}
		for (int i = 1; i <= 6 && i<= target; i++) {
			getPossibleDice1(p+i, target-i);
		}
	}
}
