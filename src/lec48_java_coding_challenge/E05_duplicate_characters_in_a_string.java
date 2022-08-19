package lec48_java_coding_challenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// This question was asked to Sana Naeem
public class E05_duplicate_characters_in_a_string {

	public static void main(String[] args) {
		String str = "a beautiful beach bob";
		int count = 0;
		str = str.replaceAll("\\s", ""); // where \\s is a single space in unicode
		System.out.println(str); // This line not needed, just for clarification
		char [] charArray = str.toCharArray();
		System.out.println(Arrays.toString(charArray)); // This line not needed, just for clarification
		
		Set <Character> moreThanOne = new HashSet<>();
		
		for (int i=0; i<charArray.length; i++ ) {
			for (int j=i+1; j<charArray.length; j++) {
				if(charArray[i] == charArray[j]) {
					count++;
					moreThanOne.add(charArray[j]);
				}
			}
		}
		System.out.println("The character present more than one are: " + moreThanOne);
		System.out.println("The character present more than one are repeated: " +count);
		
	}

}
