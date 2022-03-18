package Recursion;

public class productOfDigits {
	public static void main(String[] args) {
		int n= 1342;
		System.out.println(prodOfDigits(n));
	}
	
	static int prodOfDigits(int n) {

		/*
		 * if(n == 1) return 1;
		 */
		if(n%10 ==n) 
			return n;
		return n%10 * prodOfDigits(n/10);
	}
}
