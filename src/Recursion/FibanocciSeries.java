package Recursion;

import java.util.ArrayList;
import java.util.List;

public class FibanocciSeries {
	public static void main(String[] args) {
		int n=5;
		List<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		System.out.println(recursiveFunction(list, 2, n));
	}

	
	public static int recursiveFunction(List<Integer> list, int m, int n) {
		list.add(list.get(m-1)+list.get(m-2));
		if(list.size() == n+1) {
			return list.get(n-1);
		}
		recursiveFunction(list, m+1,n);
		return -1;
	}
	
}
