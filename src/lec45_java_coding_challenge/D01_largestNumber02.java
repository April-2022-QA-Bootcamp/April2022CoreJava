package lec45_java_coding_challenge;

import java.util.Arrays;

public class D01_largestNumber02 {

	public static void main(String[] args) {
		int temp;
	      int array[] = {10, 20, 25, 63, 96, 57};
	      for(int i = 0; i<array.length; i++ ){
	         for(int j = i+1; j<array.length; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println(Arrays.toString(array)); // no need, just showed how is the new array now
	      System.out.println("Third second largest number is:: "+array[array.length-2]);
	}

}
