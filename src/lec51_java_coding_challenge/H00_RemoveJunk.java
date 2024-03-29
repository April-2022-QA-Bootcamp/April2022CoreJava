package lec51_java_coding_challenge;

public class H00_RemoveJunk {
	// not so important
	public static void main(String[] args) {
		String s = "Hello%&^&(1234)";
		// ^a-zA-Z0-9 = called regular expression or regex
		// ^ is called carat or xor, ~ is called tilde, ` is called grave accent, back tick, back quote
		// * is called asterisk, & is called and (or) ampersand, # is called (pound, hash, number)
		// ' is called (apostrophe, prime, single quote)
		// https://finallylearn.com/what-are-the-keyboard-symbol-names/
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", "")); // similar like \\s remove single space

		// or we can do below way
		String s1 = "*&99564^%$java";
		String s2 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s2);
		
		String s3 = "H(el$lo-12__=34";
		String s4 = s3.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s4);

	}

}
