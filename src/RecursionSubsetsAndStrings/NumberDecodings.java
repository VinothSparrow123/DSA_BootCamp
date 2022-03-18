package RecursionSubsetsAndStrings;

public class NumberDecodings {
	public static void main(String[] args) {
//		decodeNumber("12","","12");
//		decodeNumber("226","","226");
		System.out.println(decodeWays("226",0));
	}
	
	public static void decodeNumber(String up, String p, String ori) {
		if(up.isEmpty()) {
			System.out.println(p);
		}
		int num;
		for (int i = 1; i <= 2 && i<up.length(); i++) {
			num = Integer.parseInt(up.substring(0, i));
			char ch = (char) ('a' + (num-1));
			if(num <= 26) {
				decodeNumber(up.substring(i),p+ch, ori);
			}else {
				decodeNumber(ori,"",ori);
			}
		}
	}
	
	public static int decodeWays(String up, int i) {
		if(up.charAt(i) == 0) {
			return 0;
		}
		if(i >= up.length()) {
			return 1;
		}
		
		int ways = decodeWays(up, i+1);
		if(i+2 < up.length() && Integer.parseInt(up.substring(i,i+2)) <= 26) {
			ways = decodeWays(up, i+2);
		}
		return ways;
	}
}