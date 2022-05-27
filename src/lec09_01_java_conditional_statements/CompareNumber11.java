package lec09_01_java_conditional_statements;

public class CompareNumber11 {

	public static void main(String[] args) {
		// Creating two variables for age and weight
		int age = 18;
		int weight = 38;
		// applying condition on age and weight
		// Condition: To donate blood, you must be greater than or equal to 18 years old and your weight should be more than 50 kg 
		
		if (age >= 18 ) { // outer of condition
			if(weight>50) { // inner if condition
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood");
			}			
		} else {
			System.out.println("Your age should be more than or equal to 18 to donate blood");
		}
	}

}
