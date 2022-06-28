package FirstJavaProgram;

public class ReverseNumber {
	public static void main(String[] args) {
		int num=12345;
//		System.out.println(reverseNumber(num));
		System.out.println(reverseString("Vinoth kumar"));
	}

	private static int reverseNumber(int num) {
		// TODO Auto-generated method stub
		String str=Integer.toString(num);
		StringBuilder build= new StringBuilder(str);
		System.out.println(build.reverse().toString());
		int reversed=0;
		while(num>0) {
			reversed = (reversed*10)+num%10;
			num = num/10;
		}
		return reversed;
	}
	
	public static String reverseString(String str) {
		if(str.isEmpty()) return "";
		
		return str.charAt(str.length()-1) + reverseString(str.substring(0,str.length()-1));
	}
}
