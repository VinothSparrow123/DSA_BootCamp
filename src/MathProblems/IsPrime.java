package MathProblems;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println(isPrimeNumber(number));
	}
	
	static boolean isPrimeNumber(int num) {
		
		if(num < 0 || num ==0 || num ==1) return false;
		
		
		int c = 2;
		
		while(c*c <= num) {
			if(num % c == 0) return false;
			c++;
		}
		
		return c*c > num;
	}
}
