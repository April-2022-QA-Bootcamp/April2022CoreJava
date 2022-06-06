package lec13_03_java_conditional_statements;

import java.util.Random;

/*
Even number (2, 4, 6, 8, 10): A number divided by 2 with remainder 0.
Example - 56 : 56/2 --- divisor 2, quotient 28, remainder 0
Odd number (1, 3, 5, 7, 9) : A number divided by 2 with remainder 1.
Example - 37 : 37/2 --- divisor 2, quotient 18, remainder 1

ava Logical Operators: 
Logical operators are used to determine the logic between variables or values. example below:

&&  Logical and operator (Returns true if both statements are true, x < 5 &&  y < 10)
||    Logical or operator (Returns true if one of the statements is true, x < 5 || y < 4)
!     Logical not operator [Reverse the result, returns false if the result is true, (!(x < 5 && y < 10))] 
 */

public class CompareNumber10 {

	public static void main(String[] args) {
		Random random = new Random();
		int val1 = random.nextInt(1000);
		int val2 = random.nextInt(1000);

		if (val1 % 2 == 0 && val1 < val2) {
			System.out.println(val1 + " is an even number and " + val1 + " is less than " + val2);
		} else if (val1 % 2 == 0 && val1 > val2) {
			System.out.println(val1 + " is an even number and " + val1 + " is greater than " + val2);
		} else if (val1 % 2 == 0 && val1 != val2) {
			System.out.println(val1 + " is an even number and " + val1 + " is not equal to " + val2);
		} else if (val1 % 2 == 0 && val1 == val2) {
			System.out.println(val1 + " is an even number and " + val1 + " is equal to " + val2);
		} else if (val1 % 2 == 0 && val1 >= val2) {
			System.out.println(val1 + " is an even number and " + val1 + " is greater than (or equal to) " + val2);
		} else if (val1 % 2 == 0 && val1 <= val2) {
			System.out.println(val1 + " is an even number and " + val1 + " is less than (or equal to) " + val2);
		} else if (!(val1 % 2 == 1 && val1 == val2)) { // please see carefully
			System.out.println(val1 + " is not an odd number and " + val1 + " is not equal to " + val2);
		} else if (val1 % 2 == 1 && val1 < val2) {
			System.out.println(val1 + " is an odd number and " + val1 + " is less than " + val2);
		} else if (val1 % 2 == 1 && val1 > val2) {
			System.out.println(val1 + " is an odd number and " + val1 + " is greater than " + val2);
		} else if (val1 % 2 == 1 && val1 != val2) {
			System.out.println(val1 + " is an odd number and " + val1 + " is not equal to " + val2);
		} else if (val1 % 2 == 1 && val1 == val2) {
			System.out.println(val1 + " is an odd number and " + val1 + " is equal to " + val2);
		}  else if (val1 % 2 == 1 && val1 >= val2) {
			System.out.println(val1 + " is an odd number and " + val1 + " is greater than (or equal to) " + val2);
		} else if (val1 % 2 == 1 && val1 <= val2) {
			System.out.println(val1 + " is an odd number and " + val1 + " is less than (or equal to) " + val2);
		} else {
			System.out.println("Please add valid number");
		}
	}

}
