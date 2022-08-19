package lec48_java_coding_challenge;

public class E02_findStringWhichPresentMoreThanOne {

	public static void main(String[] args) {
		// Here language is an String type Array.
		String[] name = { "Java", "C++", "C#", "Python", "Java", "C++", "Java", "Python", "Javascript", "C++" };

		// This coding is not 100% correct, follow the next one
		
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i].equals(name[j])) {
					System.out.println(name[i]);
				}
			}
		}
	}

}
