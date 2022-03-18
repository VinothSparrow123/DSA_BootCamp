package RecursionSubsetsAndStrings;

public class ReverseAString {
	public static void main(String[] args) {
		System.out.println(reverse("vinoth"));
	}
	
	public static String reverse(String input) {
		
		if(input.isBlank()) {
			return "";
		}
		
		return input.charAt(input.length()-1) + reverse(input.substring(0, input.length()-1));
		
	}
}
