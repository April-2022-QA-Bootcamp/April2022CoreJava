package lec43_java_coding_challenge;

// Que: How many vowel is in the String?

public class C01_countVowel {

	public static void main(String[] args) {
		String s = "Pack my box with five dozen liquor jugs";
		s = s.toLowerCase();
		int count = 0;
		for(int i=0; i<s.length(); i++ ) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				count ++;
			}
		}
		System.out.println(count);

	}

}
