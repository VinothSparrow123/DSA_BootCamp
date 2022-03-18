package FirstJavaProgram;

public class TypeCasting {
	public static void main(String[] args) {
		byte b = 50;
		char c = 'a';
		short s = 1024;
		int i = 100;
		float f = 12.12f;
		double d = 0.1234;
		
		double result = (f*b) + (i/c) - (d-s);
		//float + int - double = double
		System.out.println(result);
	}
	
}
