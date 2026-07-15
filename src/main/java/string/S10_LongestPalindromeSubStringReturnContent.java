package string;

//Longest Palindrome SubString Return Content Input: s = “forgeeksskeegfor” Output: “geeksskeeg”
public class S10_LongestPalindromeSubStringReturnContent {
	public static String expandAround(String s, int i, int j) {
		while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
			i--;
			j++;
		}
		return s.substring(i + 1, j);
	}
	public static String LongestPalindromeSubStringReturnContent(String s) {
		if (s.length() == 0 || s == null)
			return "";
		String longestPalin = "";
		for (int i = 0; i < s.length(); i++) {
			String pal1 = expandAround(s, i, i + 1);
			if (pal1.length() > longestPalin.length()) {
				longestPalin = pal1;
			}
			String pal2 = expandAround(s, i, i);
			if (pal2.length() > longestPalin.length()) {
				longestPalin = pal2;
			}
		}
		return longestPalin;
	}
	public static void main(String[] args) {
		System.out.println(LongestPalindromeSubStringReturnContent("babad")); // "bab" or "aba"
		System.out.println(LongestPalindromeSubStringReturnContent("cbbd"));  // "bb"
		System.out.println(LongestPalindromeSubStringReturnContent("racecar")); // "racecar"
		System.out.println(LongestPalindromeSubStringReturnContent("abcd"));  // "a"
	}
}