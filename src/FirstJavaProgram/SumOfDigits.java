package FirstJavaProgram;

public class SumOfDigits {
	public static void main(String[] args) {
		int num=9999;
		System.out.println(findSumOfDigits(num));
	}

	private static int findSumOfDigits(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}
}
