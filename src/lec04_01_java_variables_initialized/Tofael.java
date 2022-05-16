package lec04_01_java_variables_initialized;

public class Tofael {
	// variable initialized
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
		System.out.println("This is All about me --- \n");
	}
	
	// method implemented
	// here public is access modifier, void is type of method,
	// myInfo name of the method
	public void myInfo() {
		System.out.println("My Name: " + name + "\nMy Age: " + age + "\nMy HouseRent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance: " + myBankBalance + "\nSex: " + sex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);		
	}
	
}
