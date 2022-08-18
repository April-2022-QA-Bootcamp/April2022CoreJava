package lec48_java_coding_challenge;

public class D02_smallestNumber {

	public static void main(String[] args) {
		// This is an array
		int[] number = { 12, 10, 100, 5, 6, 2, 77, 55, 7, 8, 5, 56, 323, 2, 44, 12, 456, 6, 4, 1, 5, 5 };
		int smallest = number[0]; // why did we not use == here? good question.

		for (int i = 1; i < number.length; i++) {
			if (number[i] < smallest) {
				smallest = number[i];
			}
		}
		System.out.println(smallest);
	}

}
