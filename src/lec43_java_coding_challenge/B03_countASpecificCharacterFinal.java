package lec43_java_coding_challenge;

// Que: How many 'z/Z'  inside the provided String? They like to confuse you by not saying upper or lower
// you have to ask is it upper case or lower case?
// Better not to ask if they don't define

public class B03_countASpecificCharacterFinal {

	public static void main(String[] args) {
		String s = "ZiyadZ Alz KhilanliezZZZ";
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			// you can also convert the String to Upper case [toUpperCase()] and look for 'Z'
			if(s.toLowerCase().charAt(i)=='z') { // how many z, regardless of upper or lower
				count ++;
			}
		}
		System.out.println(count);

	}

}
