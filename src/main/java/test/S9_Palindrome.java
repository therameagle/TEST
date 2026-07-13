package test;

public class S9_Palindrome {
	public static boolean isPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start <= end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("babad")); // "bab" or "aba"
		System.out.println(isPalindrome("cbbd"));  // "bb"
		System.out.println(isPalindrome("racecar")); // "racecar"
		System.out.println(isPalindrome("abcd"));  // "a"
	}
}