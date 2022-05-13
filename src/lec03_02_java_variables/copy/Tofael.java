package lec03_02_java_variables.copy;

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

	// Constructor declared
	public Tofael () {
		System.out.println("I am Mr. Constructor. Don't be surprised when you see my strength!!");
	}
	
}
