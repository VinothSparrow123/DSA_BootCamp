package RecursionSubsetsAndStrings;


public class SkipStringIfItsRequiredString {
	public static void main(String[] args) {
		System.out.println(skipString("ababaappleappkkappleapplj"));
	}
	
	static String skipString(String input) {
		
		if(input.isEmpty()) {
			return "";
		}
		if(input.startsWith("apple")) {
			return "apple"+skipString(input.substring(5));
		}else if(input.startsWith("app")){
			return skipString(input.substring(3));
		}else {
			return input.charAt(0) + skipString(input.substring(1));
		}
		
	}
}
