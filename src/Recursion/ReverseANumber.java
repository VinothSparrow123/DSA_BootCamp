package Recursion;

public class ReverseANumber {
	public static void main(String[] args) {
		int n= 12345;
		int sum=0;
		System.out.println(reverse(n,sum));
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
	
	
}
