package lec06_02_java_methods;

public class Calculator03 {
	// global variable or class variable
	float a = 1.34f;
	float b = 3.22f;

	// return type method
	public float multiplication() {
		float total1 = a * b;
		System.out.println("Multiplication of a and b is: " + total1);
		return total1;
	}

	// learning something new
	// Added later, return type parameterized method
	public float division(float c, float d) { // as a local variable
		float total2 = c / d;
		System.out.println("Division of c and d is: " + total2);
		return total2;
	}

}
