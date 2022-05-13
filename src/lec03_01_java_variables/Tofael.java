package lec03_01_java_variables;

public class Tofael {
	public String name = "Mohammad Sharkar";
	public byte age = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 2147483647;
	public long myBankBalance = 9223372036854775807l; // we have to use l, at the end of long value
	public float myHeight = 1.67647f; // we have to use f, at the end of float value
	public double myGrade = 3.645265372563;
	public char sex = 'M';
	public boolean usCitizen = false;

	public static void main(String[] args) {
		// Tofael is a class, tofael is an object or reference variable - object always start with lower case
		// = equal operator, new is a keyword
		// an object is created (tofael) from Tofael class which is new and Tofael type
		// This action --> (when an object is created from the class) is called instantiation, (vvImp info)
		// Then we say the class (Tofael) is instantiated
		Tofael tofael = new Tofael();
		System.out.println(tofael.name);
		System.out.println(tofael.age);
		System.out.println(tofael.name + tofael.age);
		System.out.println("My Name: " + tofael.name + "\nMy Age: " + tofael.age); // we can call all variables here, but I didn't do
	
	}

}
