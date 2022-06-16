package lec17_Java_Nested_Class;

public class JFK02 { // Opening of Outer class body
	// Inner class must be instantiated inside outer class
	TerminalOne t1 = new TerminalOne();
	TerminalTwo t2 = new TerminalTwo();
	TerminalFour t4 = new TerminalFour();
	
	// Here is the change
	// Method from Outer class
	public void welcome() {
		System.out.println("Welcome to JFK Airport");
		t1.destination(); // the inner class object can call their methods inside the outer class method
		t2.usAirlines();
		t4.arabianFlights();
	}

	// First inner class
	public class TerminalOne { // Opening of inner class body
		// Method from Inner class
		public void destination() {
			System.out.println("Terminal one is for Saudi Airlines");
		}
	} // Closing of inner class body

	// Second inner class
	public class TerminalTwo {
		public void usAirlines() {
			System.out.println("Terminal two is for Delta International");
		}
	}
	
	// Here is the change
	// Static Nested class
	public static class TerminalFour { 
		public void arabianFlights () {
			System.out.println("Terminal four is for Emirates International");
		}
	} 

} // Closing of Outer class body
