package lec14_java_oop_abstraction;

// This is an abstract class
// we must have to put abstract keyword in abstract class
// An abstract class can inherit only one abstract class or one regular class by extends key word
// An abstract class can't inherit an Interface by extends key word

// implements keyword is used to inherit Interface in abstract class
// an abstract class can inherit more than one Interface
// an abstract class cannot inherit a regular class or abstract class by implements keyword

public abstract class ElectricCar extends FlyingCar implements Rocket, HoverCar{
	// Interview question: Can we create variables inside Abstract class?
	public String nameElectricCar = "Tesla";
	public int costElectricCar = 45000;
	
	// Constructor declared
	// Interview question: Can a Constructor of Abstract class be initialized?
	// Answer: Yes Possible, if Abstract class is instantiated by concrete class
	public ElectricCar() {
		System.out.println("This constructor is from Abstract class-- Electric Car");
	}
		
	// method implemented
	public static void battery() {
		System.out.println("The Battery is very efficient, from Electric Car class");
	}
	
	// method declared
	// when method is declared, that method is also called abstract method
	// This is mandatory to put abstract keyword with the abstract method inside Abstract Class
	// This is the norm to write at least one abstract method inside abstract class
	public abstract void price();
	
	public abstract String electricCarName(); // return type abstract method
	
	// Default methods are allowed only in interfaces.
	
	/*
	public default void noGas() {
		System.out.println("noGas feature from Car Interface");
	}	
	*/

}
