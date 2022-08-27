package lec51_java_coding_challenge;

// 4321234 = Palindrome Number

//42123 = Not Palindrome Number 
// few times asked (not so important)

public class I01_palindromeNumber {

	public static boolean isPalindrome(int num) {
		int r = 0;
		int sum = 0;
		int t = num;

		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}

		if (t == sum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Palindrome Number? Ans: " + isPalindrome(313));
		System.out.println("Palindrome Number? Ans: " + isPalindrome(213));

	}

}
