package RecursionSubsetsAndStrings;


public class SkipString {
	public static void main(String[] args) {
		System.out.println(skipString("ababaapplekkapplej"));
	}
	
	static String skipString(String input) {
		
		if(input.isEmpty()) {
			return "";
		}
		if(input.startsWith("apple")) {
			return skipString(input.substring(5));
		}else {
			return input.charAt(0) + skipString(input.substring(1));
		}
		
	}
}
