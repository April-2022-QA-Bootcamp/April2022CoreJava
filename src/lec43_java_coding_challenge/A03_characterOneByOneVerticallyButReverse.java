package lec43_java_coding_challenge;

/*
Que: Print your name vertically but reverse (without changing the for loop), can skip it, if feel tough

*/

// From Kabir , alternate of A02
public class A03_characterOneByOneVerticallyButReverse {

	public static void main(String[] args) {
		String s = "Tofael Kabir";
		
		for(int i=0; i<s.length(); i++) {
			//System.out.println(s.charAt(i));
			System.out.println(s.charAt(s.length()-1-i));
		}
	
	}

}
