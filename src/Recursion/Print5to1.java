package Recursion;

public class Print5to1 {
	public static void main(String[] args) {
		int n=5;
		printNumbersBoth(n);
	}
	
	static void printNumbers(int n) {
		System.out.println(n);
		if(n==1) 
			return;
		printNumbers(n-1);
	}
	
	static void printNumbersOrder(int n) {
		if(n==0) 
			return;
		printNumbersOrder(n-1);
		System.out.println(n);
	}
	
	static void printNumbersBoth(int n) {
		if(n==0) 
			return;
		System.out.println(n);
		printNumbersBoth(n-1);
		System.out.println(n);
	}

}
