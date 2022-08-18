package lec45_java_coding_challenge;

// Que: How many 'z/Z'  inside the provided String? They like to confuse you by not saying upper or lower
// you have to ask is it upper case or lower case?
// Better not to ask if they don't define

public class B04_countASpecificCharacterFinal {

	public static void main(String[] args) {
		String s = "ZiyadZ Alz KhilanliezZZZ";
		s = s.toLowerCase(); // if we use it in line 15, execution time is more, so we used here
		// alternate of B03
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='z') {
				count ++;
			}
		}
		System.out.println(count);

	}

}
