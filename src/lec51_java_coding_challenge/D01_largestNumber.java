package lec51_java_coding_challenge;

import java.util.Arrays;

public class D01_largestNumber {

	public static void main(String[] args) {
		// This is an array
		int[] number = {12, 10, 100, 5, 6, 2, 892, 77, 55, 7, 8, 5, 56, 323, 2, 44, 12, 456, 6, 4, 5, 5 };
		int largest = number[0]; // why did we not use == here? good question.

		for (int i = 1; i < number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];
			}
		}
		System.out.println(Arrays.toString(number)); // no need, just showed how is the new array now
		System.out.println(largest);
	}

}
