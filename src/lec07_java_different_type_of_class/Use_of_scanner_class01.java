package lec07_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class01 {

	public static void main(String[] args) {
		System.out.println("Please Enter your age: ");
		Scanner scanner = new Scanner(System.in); // this Scanner class allow me to write
		int age = scanner.nextInt(); // this method reads an int value from the user
		System.out.println("\nYour age is: "+ age);
		scanner.close();
	}

}
