package lec07_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class03 {

	public static void main(String[] args) {
		System.out.println("Please put grade here: ");
		Scanner scanner = new Scanner(System.in);
		float val1 = scanner.nextFloat(); // no need to use f in the console, because float type use f at the Editor.
		float val2 = scanner.nextFloat();
		float total = val1+val2;
		System.out.println("\nThe sum of the val1 and val2 as grade is: " + total);
		scanner.close();
	}

}
