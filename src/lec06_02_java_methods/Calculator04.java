package lec06_02_java_methods;

public class Calculator04 {
	// Global variable or class variable
	// default type of access modifier is used
	byte a = 50; 
	byte b = 11;
	
	// return type method
	// in terms of byte without casting, not possible to execute code, do some research.
	// need answer immediately
	public byte division() {
		byte total1 = (byte) (a/b);
		System.out.println("Division of a and b is: "+total1);
		return total1;
	}
	
	// how the result is 38, while it should be 550, out of range of byte
	public byte multiplication() {
		byte total2 = (byte) (a*b);
		System.out.println("Multiplication of a and b is: "+total2);
		return total2;
	}

}
