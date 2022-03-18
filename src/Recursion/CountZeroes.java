package Recursion;

public class CountZeroes {
	public static void main(String[] args) {
		int n=020020;
		int count = 0;
		System.out.println(countZeroes(n, count));
	}
	
	static int countZeroes1(int n, int count) {
		if(n < 10 && n%10 ==0)
			return count++;
		if(n%10 == 0)
			count++;
		return countZeroes1(n/10, count);
	}
	
	static int countZeroes(int n, int count) {
		if(n == 0) 
			return count;
		if(n%10 == 0)
			return countZeroes(n/10, count+1);
		return countZeroes(n/10, count);
	}
}
