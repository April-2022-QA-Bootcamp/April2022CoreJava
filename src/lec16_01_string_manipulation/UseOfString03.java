package lec16_01_string_manipulation;

public class UseOfString03 {

	public static void main(String[] args) {
		/*
		 * The compareTo() method returns 0 if the two strings are equal, a number less than 0 if the first String is larger, 
		 * and a number greater than 0 if the second String is larger. Uppercase letters come before lowercase letters when 
		 * the method compares strings. As you work through learning this method's function, test our example program 
		 * and use the ascii table to see how far apart the characters are from each other.
		 */
		// The Java String class compareTo() method compares the given string with the
		// current string lexicographically. It returns a positive number, negative number, or 0.
		
		System.out.println("------------------------------------------------------------------------\n");
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "meklo";
		String s4 = "hemlo";
		String s5 = "flag";
		String s26 = "Hello";  // h=104, H=72, based on ASCII table
		
		System.out.println(s1.compareTo(s2)); // 0 because both are equal
		System.out.println(s1.compareTo(s3)); // -5 because "h" is 5 times lower than "m"
		System.out.println(s1.compareTo(s4)); // -1 because "l" is 1 times lower than "m"
		System.out.println(s1.compareTo(s5)); // 2 because "h" is 2 times greater than "f"
		System.out.println(s1.compareTo(s26)); // Please see line 21 and from 7-11 // high level
		
		// The Java String class contains() method searches the sequence of characters in this string. This is used as method in many places
		System.out.println("\n ------------------------------------------------------------------------\n");
		String s6 = "How much you know about Java";
		System.out.println(s6.contains("much you know"));
		System.out.println(s6.contains("about"));
		System.out.println(s6.contains("hello")); // false
		System.out.println(s6.contains("Java"));
		
		// The java string startsWith() method checks if this string starts with given prefix.
		System.out.println("\n ------------------------------------------------------------------------\n");
		String s7 = "java by javatpoint";
		System.out.println(s7.startsWith("j"));
		System.out.println(s7.startsWith("J")); // false
		System.out.println(s7.startsWith("java"));
		System.out.println(s7.startsWith("Nava"));

		// The Java String class endsWith() method checks if this string ends with a given suffix.
		System.out.println("\n ------------------------------------------------------------------------\n");
		System.out.println(s7.endsWith("t"));
		System.out.println(s7.endsWith("T")); // false
		System.out.println(s7.endsWith("point"));
		System.out.println(s7.endsWith("pointer"));
		
		// The Java String class isEmpty() method checks if the input string is empty or not.
		System.out.println("\n ------------------------------------------------------------------------\n");
		String s8 = "";
		String s9 = "javatpoint";
		System.out.println(s8.isEmpty());
		System.out.println(s9.isEmpty());
		
		// The Java String class join() method returns a string joined with a given delimiter.
		System.out.println("\n ------------------------------------------------------------------------\n");
		String joinTheString = String.join("*", "welcome", "to", "javatpoint");
		System.out.println(joinTheString);
		
		// The Java String class lastIndexOf() method returns the last index of the
		// given character value or substring.
		System.out.println("\n ------------------------------------------------------------------------\n");
		String s10 = "this is index of examples"; // there are 2 's' characters in this sentence		
		System.out.println(s10.indexOf('s')); // First one: 3
		// returns last index of 's' char value
		System.out.println(s10.lastIndexOf('s')); // 24
		
		// The java string valueOf() method converts different types of values into string.
		// how to turn int, float etc. to String
		System.out.println("\n ------------------------------------------------------------------------\n");
		int age = 30;
		String s11 = String.valueOf(age);
		System.out.println(s11 + 10); // concatenating string with 10

	}

}
