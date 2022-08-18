package lec45_java_coding_challenge;

import java.util.HashSet;
import java.util.Set;

public class E03_findStringWhichPresentMoreThanOne {

	public static void main(String[] args) {
		// Here language is an String type Array.
		String[] language = { "Java", "C++", "C#", "Python", "Java", "C++", "Java", "Python", "Javascript", "C++" };

		Set <String> notMoreThanOne = new HashSet<>();
		
		for ( int i = 0; i<language.length; i++) {
			for (int j = i+1; j<language.length; j++) {
				if (language[i].equals(language[j])) {
					notMoreThanOne.add(language[i]);
				}
			}
		}
		System.out.println(notMoreThanOne);
	}

}
