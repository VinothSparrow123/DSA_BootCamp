package Patterns;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int a;
	public String b;

	// Default constructor
	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}

}
