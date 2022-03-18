package RecursionSubsetsAndStrings;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAphoneNumber {
	public static void main(String[] args) {
		phonePad("","23");
		System.out.println(phonePadRet("","43"));
	}
	
	/*
	 * Pseudo Code:
	 * 
	 * Define processed and unprocessed (as this flow says add one number and add another number we can use p and up string)
	 * Convert the string into an integer
	 * in a for loop:
	 * 		Define the limits (digits-1)*3 to digits*1
	 * 		using recursion call the method using truncated up and extended processed
	 * 		
	 */
	
	static void phonePad(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		int digits = up.charAt(0) -'0';
		
		for (int i = (digits-1)*3; i < digits*3; i++) {
			char ch = (char) ('a' + i);
			phonePad(p+ch, up.substring(1));
		}
		
	}
	
	static List<String> phonePadRet(String p, String up) {
		if(up.isEmpty()) {
			List<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		int digits = up.charAt(0) -'0';
		
		List<String> output = new ArrayList<>();
		
		for (int i = (digits-1)*3; i < digits*3; i++) {
			char ch = (char) ('a' + i);
			output.addAll(phonePadRet(p+ch, up.substring(1)));
		}
		return output;
		
	}
}
