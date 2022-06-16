package lec17_Java_Nested_Class;

public class JFK04 { // Opening of Outer class body
	// Inner class must be instantiated inside outer class
	TerminalOne t1 = new TerminalOne();
	TerminalTwo t2 = new TerminalTwo();
	TerminalFour t4 = new TerminalFour();
	
	// Here is the change
	// Method from Outer class
	public void welcome() {
		System.out.println("Welcome to JFK Airport");
	}

	// First inner class
	public class TerminalOne { // Opening of inner class body
		// Method from Inner class
		public void destination() {
			System.out.println("Terminal one is for Saudi Airlines");
			welcome(); // inner class method can access the outer class method directly, no object necessary
			t2.usAirlines();
			t4.arabianFlights();
			TerminalFour.asianFlights();
		}
	} // Closing of inner class body

	// Second inner class
	public class TerminalTwo {
		public void usAirlines() {
			System.out.println("Terminal two is for Delta International");
			welcome(); // inner class method can access the outer class method directly, no object necessary
			t1.destination();
			t4.arabianFlights();
			TerminalFour.asianFlights();
		}
	}
	
	// Here is the change
	// Static Nested class
	public static class TerminalFour { // If you remove static keyword from here, what kind of change you can see? and why?
		public void arabianFlights () {
			System.out.println("Terminal four is for Emirates International");
			// non static members cannot be called inside static members
			// welcome();
			// t2.usAirlines();
			// t1.destination();
		}
		public static void asianFlights () {
			System.out.println("Terminal four is also for Thai International");
		}
	} 

} // Closing of Outer class body
