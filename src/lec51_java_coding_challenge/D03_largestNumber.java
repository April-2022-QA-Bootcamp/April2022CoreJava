package lec51_java_coding_challenge;

import java.util.Arrays;

// Que: To Raihan, Can you find the second largest number from the Array

public class D03_largestNumber {

	// This is not accepted by interviewer
	public static void main(String[] args) {
		int array[] = {12, 10, 100, 5, 6, 2, 892, 77, 55, 7, 8, 5, 56, 323, 2, 44, 12, 456, 6, 4, 5, 5};
		System.out.println("Unsorted Array ::> " + Arrays.toString(array)); // no need
		Arrays.sort(array);
		System.out.println("Sorted Array ::> " + Arrays.toString(array)); // no need
		System.out.println("Smallest element is ::> " + array[0]);
		System.out.println("Largest element is ::> " + array[array.length-1]);
		System.out.println("2nd largest element is ::> " + array[array.length - 2]);
	}

}
