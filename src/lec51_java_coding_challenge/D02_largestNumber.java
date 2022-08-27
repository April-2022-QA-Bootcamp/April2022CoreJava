package lec51_java_coding_challenge;

import java.util.Arrays;

public class D02_largestNumber {

	public static void main(String[] args) {
		int temp;
		int array[] = { 12, 10, 100, 5, 6, 2, 892, 77, 55, 7, 8, 5, 56, 323, 2, 44, 12, 456, 6, 4, 5, 5 };
		System.out.println(Arrays.toString(array)); // no need, just showed how is the new array now
		
		for (int i = 0; i < array.length; i++) { // 12				
			for (int j = i + 1; j < array.length; j++) { // 10, 100, 5, 6, 2, 892, 77, 55, 7, 8, 5, 56, 323, 2, 44, 12, 456, 6, 4, 5, 5			
				if (array[i] > array[j]) {
					// This is called swapping
					temp = array[i]; // temp =12
					array[i] = array[j]; // array[i] = 10
					array[j] = temp; // array[j]=12
				}
			}
		}
		System.out.println(Arrays.toString(array)); // no need, just showed how is the new array now
		System.out.println("Second largest number is:: " + array[array.length - 2]);
		System.out.println("Largest number is:: " + array[array.length - 1]);
		System.out.println("Smallest number is:: " + array[0]);
		System.out.println("Second Smallest number is:: " + array[1]);
	}

}
