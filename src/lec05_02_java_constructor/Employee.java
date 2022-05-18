package lec05_02_java_constructor;

public class Employee {
	// Global variable or Class variable
	public String empName; // variables declared
	public int empId;
	public char empSex;
	public boolean fullTimeEmployee;
	
	// default constructor (no argument constructor) declared
	public Employee() {
		System.out.println("This deafult Constructor is from Employee class");
	}

	// Parameterized constructor declared
	public Employee(String empName, int empId, char empSex, boolean fullTimeEmployee) {
		this.empName = empName;
		this.empId = empId;
		this.empSex = empSex;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("The Employee Name is: " + empName + ", Employee Id: " + empId+", Employee Sex: " + empSex+" and Full time Employee? Ans: " +fullTimeEmployee); 
	}
	
	// Parameterized method implemented
	public void employee(String empName, int empId, char empSex, boolean fullTimeEmployee) {
		// inside the parameterized method, It's not mandatory to make a relation between global and local variable
		this.empName = empName;
		this.empId = empId;
		this.empSex = empSex;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee Name : " + empName + ", Id: " + empId+", Sex: " + empSex+" and Full time? Ans: " +fullTimeEmployee); 
	}
	
}
