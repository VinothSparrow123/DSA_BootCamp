package Permutations;

import java.util.ArrayList;
import java.util.List;

public class BasicPermutationWithString {
	public static void main(String[] args) {
		String processed = "", up = "abcde";
//		System.out.println(permutationWithStringRet(processed,up));
		System.out.println(permutationWithStringCount(processed, up));
	}

	/*
	 * Pseudo code: define processed and unprocessed strings processed = "";
	 * up=input string
	 * 
	 * in a for loop -> add first character from up to processed. using the
	 * processed length -> add the string when up becomes empty
	 */

	static void permutationWithString(String processed, String up) {

		// List<String> ans=new ArrayList<>();

		if (up.isBlank()) {
			System.out.println(processed);
			return;
		}

		char ch = up.charAt(0);

		for (int i = 0; i <= processed.length(); i++) {
			String first = processed.substring(0, i);
			String second = processed.substring(i, processed.length());
			permutationWithString(first + ch + second, up.substring(1));
		}

//		return ans;	
	}

	static List<String> permutationWithStringRet(String processed, String up) {

		List<String> ans = new ArrayList<>();

		if (up.isEmpty()) {
			ArrayList<String> array = new ArrayList<>();
			array.add(processed);
			return array;
		}

		char ch = up.charAt(0);

		for (int i = 0; i <= processed.length(); i++) {
			String first = processed.substring(0, i);
			String second = processed.substring(i, processed.length());
			ans.addAll(permutationWithStringRet(first + ch + second, up.substring(1)));
		}

		return ans;
	}

	static int permutationWithStringCount(String processed, String up) {

		// List<String> ans=new ArrayList<>();

		if (up.isBlank()) {
			return 1;
		}
		int count = 0;
		char ch = up.charAt(0);

		for (int i = 0; i <= processed.length(); i++) {
			String first = processed.substring(0, i);
			String second = processed.substring(i, processed.length());
			count = count + permutationWithStringCount(first + ch + second, up.substring(1));
		}

		return count;
	}
}
