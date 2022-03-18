package RecursionSubsetsAndStrings;

public class CountOccurances {
	
	public static void main(String[] args) {
		String s1="Welcome to Kallangadu on behalf of Vinoth. As he went to hunting for this week. Adding towards to verify.";
		String s2 = "to";
		System.out.println(count(s1,s2));
		
	}
	
	public static int count(String s1, String s2) {
		
		if(!s1.contains(s2)) {
			return 0;
		}
		
		return count(s1.replaceFirst(s2, ""), s2)+1;
	}

}
