package lec45_java_coding_challenge;

public class C02_countConsonant {

	public static void main(String[] args) {
		String s = "A quick brown fox jumps over the lazy dog";
		s = s.toLowerCase();
		int count = 0; 
		for(int i=0; i<s.length(); i++ ) {
			if(s.charAt(i) !='a' && s.charAt(i) !='e' && s.charAt(i) !='i' && s.charAt(i) !='o' && s.charAt(i) !='u') {
				count ++;
			}
		}
		System.out.println(count);

	}

}

// A01 to C02 = First level interview coding challenge
