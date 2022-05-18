package lec05_01_java_constructor;

public class EmployeeTest {

	public static void main(String[] args) {
		 // default Constructor initialized
		Employee employee = new Employee();
		// Here Tofael is an argument, in Employee class, 
		// empName was a parameter and that was String type
		// Parameterized Constructor 01 is initialized
		Employee employee01 = new Employee("Shahed"); 
		// Parameterized Constructor 02 initialized
		Employee employee02 = new Employee("Tofael", 652432); 
		// Parameterized Constructor 03 initialized
		Employee employee03 = new Employee("Jenifer", 653627, 'F');
		// Parameterized Constructor 04 initialized
		Employee employee04 = new Employee("Alex", 55427, 'M', true ); 
		// Parameterized Constructor 05 initialized
		Employee employee05 = new Employee("Robert", 11427, false, 'M'); 
		
		// summary:
		// we must have to put the argument in a sequence like the way local variable (parameter) declared in constructor
		// it doesn't matter the sequence of variable declared inside sysout
		// It is possible to create a parameterized constructor with the same number of variables 
		// but they are organized in a different manner.
		
	}

}
