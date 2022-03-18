package FirstJavaProgram;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float tempC = input.nextFloat();
		
		float tempInF =  (tempC * 9/5) + 32;
		System.out.println(tempInF);
		
	}
}
