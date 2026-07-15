package string;

import java.util.HashMap;

//Longest substring with distinct characters CountInput: s = "geeksforgeeks" Output: 7
public class S7_LongestUniqueSubstr {
	public static int longestUniqueSubstr(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		int left = 0, maxLength = 0;
		for (int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);
			if (map.containsKey(ch) && map.get(ch) >= left) {
				left = map.get(ch) + 1;
			}
			map.put(ch, right);
			maxLength = Math.max(maxLength, right - left + 1);
		}
		return maxLength;
	}
	public static void main(String[] args) {
		System.out.println(longestUniqueSubstr("geeksforgeeks"));
		System.out.println(longestUniqueSubstr("abcabcbb"));
	}
}