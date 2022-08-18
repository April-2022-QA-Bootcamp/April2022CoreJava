package lec45_java_coding_challenge;

import java.util.Arrays;

// This solution is from Esfak, not accepted by Interviewer

public class D04_findLargestAndSmallestNumber {

	public static void main(String[] args) {
		// This is an array
		int[] number = { 12, 10, 100, 5, 6, 2, 892, 77, 55, 7, 8, 5, 56, 323, 2, 44, 12, 456, 6, 4, 1, 5, 5 };
		Arrays.sort(number);
		// This line is to see them in ascending order
		System.out.println(Arrays.toString(number));
		// print lowest and highest number
		System.out.println("lowest number: " + number[0]);
		System.out.println("highest number: " + number[number.length - 1]);
	}

}
