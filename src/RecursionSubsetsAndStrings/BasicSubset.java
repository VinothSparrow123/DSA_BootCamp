package RecursionSubsetsAndStrings;

import java.util.ArrayList;

public class BasicSubset {
	/*
	 * Subset: The pattern of taking some elements or removing some elements
	 * known as 'Subset' pattern
	 * 
	 * Subset for Arrays
	 * Subsequence for Strings
	 */
	
	public static void main(String[] args) {
//		subseqArrayASCII("","abc");
		System.out.println(subseqArrayASCIIRet("","abc"));
	}
	
	public static void subseq(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		subseq(p + up.charAt(0), up.substring(1));
		subseq(p, up.substring(1));
	}
	
	public static ArrayList<String> subseqArray(String p, String up) {
		if(up.isEmpty()) {
			ArrayList<String> array= new ArrayList<>();
			array.add(p);
			return array;
		}
		ArrayList<String> left = subseqArray(p + up.charAt(0), up.substring(1));
		ArrayList<String> right = subseqArray(p, up.substring(1));
		
		left.addAll(right);
		
		return left;
	}
	
	public static void subseqArrayASCII(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		subseqArrayASCII(p + up.charAt(0), up.substring(1));
		subseqArrayASCII(p, up.substring(1));
		subseqArrayASCII(p+(up.charAt(0)+0), up.substring(1));
	
	}
	
	public static ArrayList<String> subseqArrayASCIIRet(String p, String up) {
		if(up.isEmpty()) {
			ArrayList<String> array= new ArrayList<>();
			array.add(p);
			return array;
		}
		ArrayList<String> left = subseqArray(p + up.charAt(0), up.substring(1));
		ArrayList<String> right = subseqArray(p, up.substring(1));
		ArrayList<String> askii = subseqArray(p+(up.charAt(0)+0), up.substring(1));

		left.addAll(right);
		left.addAll(askii);
		
		return left;
	}
	
}
