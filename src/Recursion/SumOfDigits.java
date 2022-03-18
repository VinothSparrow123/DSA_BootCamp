package Recursion;

public class SumOfDigits {
	public static void main(String[] args) {
		int n= 1342;
		int ans = 0;
		System.out.println(sumOfDigits(n));
	}
	
	static int sumOfDigits(int n) {

		if(n < 10) 
			return n;
		return n%10 + sumOfDigits(n/10);
	}
}
