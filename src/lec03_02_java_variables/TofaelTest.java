package lec03_02_java_variables;

public class TofaelTest {

	public static void main(String[] args) {
		
		Tofael tofael = new Tofael(); // When we create an object, Constructor is Initialized
		System.out.println("My Name: " + tofael.name + "\nMy Age: " + tofael.age + "\nMy HouseRent: " + tofael.myApartmentRent
				+ "\nYearly Salary: " + tofael.myYearlySalary + "\nMy Bank Balance: " +tofael.myBankBalance + "\nSex: " + tofael.sex
				+ "\nMy Height: " + tofael.myHeight + "\nMy Grade: " + tofael.myGrade + "\nAm I US Citizen? Ans: " + tofael.usCitizen);

	}

}
