package lec09_01_java_conditional_statements;

import java.util.Random;

public class CompareNumber12 {

	public static void main(String[] args) {
		Random random = new Random();
		int val1 = random.nextInt(1000);
		int val2 = random.nextInt(1000);
		
		if (val1%2==0) {
			if (val1>val2) {
				if (val2%2 ==0) {
					System.out.println(val1 + " is an even number and " + val1 + " is greater than " + val2 + ", and " + val2 + " is an even number");
				} else if (val2%2 ==1) {
					System.out.println(val1 + " is an even number and " + val1 + " is greater than " + val2 + ", and " + val2 + " is an odd number");
				}			
			} else if (val1 <val2) {
				System.out.println(val1 + " is an even number and " + val1 + " is less than " + val2);
			} else if (val1 != val2) {
				System.out.println(val1 + " is an even number and " + val1 + " is not equal to " + val2);
			} else if (val1 == val2) {
				System.out.println(val1 + " is an even number and " + val1 + " is equal to " + val2);
			} else if (val1 >= val2) {
				System.out.println(val1 + " is an even number and " + val1 + " is greater than (or equal to) " + val2);
			} else if (val1 <= val2) {
				System.out.println(val1 + " is an even number and " + val1 + " is less than (or equal to) " + val2);
			} 			
		} else if (val1%2==1) {
			if (val1>val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is greater than " + val2);
			} else if (val1 <val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is less than " + val2);
			}else if (val1 != val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is not equal to " + val2);
			} else if (val1 == val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is equal to " + val2);
			} else if (val1 >= val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is greater than (or equal to) " + val2);
			} else if (val1 <= val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is less than (or equal to) " + val2);
			}		
		} else {
			System.out.println("Please add valid number");
		}
	}

}
