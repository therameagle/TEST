package test;

import java.util.HashMap;
import java.util.Map;

//Longest Substring with K Uniques Input: s = "aabacbebebe", k = Output: 7
public class S8_LongestkSubstr {
	public static int longestkSubstr(String s, int k) {
		int j = 0, maxLen = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			if (map.size() > k) {
				char c = s.charAt(j);
				map.put(c, map.get(c) - 1);
				if (map.get(c) == 0) {
					map.remove(c);
				}
				j++;
			}
			if (map.size() == k) {
				maxLen = Math.max(maxLen, i - j + 1);
			}
		}
		if (maxLen == 0) {
			return -1;
		}
		return maxLen;
	}

	public static void main(String[] args) {
		System.out.println(longestkSubstr("geeksforgeeks",7));
	}
}