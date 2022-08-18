package lec48_java_coding_challenge;

import java.util.Arrays;

public class D01_largestNumber03 {

	public static void main(String[] args) {
		int array[] = {10, 20, 25, 63, 96, 57};
	      Arrays.sort(array);
	      System.out.println("sorted Array ::> "+Arrays.toString(array));
	      System.out.println("2nd largest element is ::> "+ array[array.length-2]);
	}

}
