package FirstJavaProgram;

import java.util.Scanner;

public class CountTheDigits {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		int count = 0;
		
		while (number > 0) {
			if(number % 10 == 7) {
				count+=1;
			}
			number = number /10;
		}
		System.out.println(count);
	}
}
