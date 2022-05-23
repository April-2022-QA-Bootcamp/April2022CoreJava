package lec07_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class04 {

	public static void main(String[] args) {
		System.out.println("Please Put your full Name here: ");
		Scanner scanner = new Scanner(System.in);
		String myName = scanner.nextLine();
		System.out.println("\nHey ! " + myName + " , now you know how the Scanner class works!!");
		scanner.close();

	}

}
