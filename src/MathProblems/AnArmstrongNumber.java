package MathProblems;

import java.util.Iterator;
import java.util.Scanner;

public class AnArmstrongNumber {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int number = input.nextInt();
		for (int i = 100; i < 1000; i++) {
			if(isArmstrongNumber(i)) {
				System.out.println(i);
			}
			
		}
		
	}
	
	static boolean isArmstrongNumber(int num) {
		int sum = 0;
		int tempNum = num;
		while (tempNum > 0) {
			int digit = tempNum % 10;
			sum = sum + (digit*digit*digit);
			
			tempNum = tempNum/10;
		}
	
		return num == sum;
	}
}
