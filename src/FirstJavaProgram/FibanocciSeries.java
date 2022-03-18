package FirstJavaProgram;

import java.util.Scanner;

public class FibanocciSeries {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		int a=0;
		int b=1;
		int n=2;
	
		
		while (n <= number) {
			int temp = b;
			b = a + b;
			a = temp;
			n+=1;
		}
		System.out.println(b);
	}
}
