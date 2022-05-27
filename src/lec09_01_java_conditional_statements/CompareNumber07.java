package lec09_01_java_conditional_statements;

/*
Even number (2, 4, 6, 8, 10): A number divided by 2 with remainder 0.
Example - 56 : 56/2 --- divisor 2, quotient 28, remainder 0
Odd number (1, 3, 5, 7, 9) : A number divided by 2 with remainder 1.
Example - 37 : 37/2 --- divisor 2, quotient 18, remainder 1
 */

import java.util.Scanner;

public class CompareNumber07 {

	public static void main(String[] args) {
		System.out.println("Please put a number: ");
		Scanner scanner = new Scanner(System.in);
		int val1 = scanner.nextInt();
		// % is called modulus or remainder, here 2 is divisor, and 0 is the remainder/modulus
		if (val1 % 2 == 0) { // from this page, you learn how to represent the code for odd and even number
			System.out.println(val1 + " is an even number");
		} else if (val1 % 2 == 1) {
			System.out.println(val1 + " is an odd number");
		}

	}

}
