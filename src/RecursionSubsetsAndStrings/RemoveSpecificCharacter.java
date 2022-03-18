package RecursionSubsetsAndStrings;

import java.util.Iterator;

public class RemoveSpecificCharacter {
	public static void main(String[] args) {
//		removeCharUsingBT("baaccaab", "");
		System.out.println(removeCharUsingBTSample("cccdarabaccbacc"));
	}
	
	static String removeCharacters(String input) {
		StringBuilder str=new StringBuilder(input);
		for (int i = input.length()-1; i >= 0; i--) {
			if(str.charAt(i) == 'c') {
				str.deleteCharAt(i);
			}
		}
		return str.toString();
	}
	
	static String removeCharUsingBT(String input, int index, String ans) {
		
		if(index == input.length()) 
			return ans;
		
		if(input.charAt(index) == 'c') {
			return removeCharUsingBT(input, index+1, ans);
		}else {
			return removeCharUsingBT(input, index+1, ans+input.charAt(index));
		}
		
	} 
	
	static String removeCharUsingBT(String input, int index) {
		
		if(index == input.length()) 
			return "";
		
		if(input.charAt(index) == 'c') {
			return removeCharUsingBT(input, index+1);
		}else {
			return input.charAt(index)+removeCharUsingBT(input, index+1);
		}
		
	}
	
	static void removeCharUsingBT(String input, String processed) {
		
		if(input.isEmpty()) {
			System.out.println(processed);
			return;
		}
		if(input.charAt(0) == 'c') {
			removeCharUsingBT(input.substring(1), processed);
		}else {
			removeCharUsingBT(input.substring(1), input.charAt(0) + processed);
		}
		
	}
	
	static String removeCharUsingBTSample(String input) {
		
		if(input.isEmpty()) {
			return "";
		}
		if(input.charAt(0) == 'c') {
			return removeCharUsingBTSample(input.substring(1));
		}else {
			return input.charAt(0) + removeCharUsingBTSample(input.substring(1));
		}
		
	}
	
	
}
