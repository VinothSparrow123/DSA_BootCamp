package Recursion;

public class Palindrome {
	public static void main(String[] args) {
		int n= 123454321;
		int sum=0;
		System.out.println(palin(n,sum));
	}
	
	static int reverse(int n, int sum) {

		/*
		 * if(n == 1) return 1;
		 */
		sum = (sum * 10) + n%10;
		if(n%10 ==n) 
			return sum;

		return (reverse(n/10, sum));
	}
	
	static boolean palin(int n, int sum) {
		return n==reverse(n, sum);
	}
	
	
}
