package test;

import java.util.HashMap;
import java.util.Map;

public class S1_Anagram {
	public static boolean isomorphic(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		if (l1 != l2)
			return false;
		Map<Character, Character> mp1 = new HashMap<>();
		Map<Character, Character> mp2 = new HashMap<>();
		for (int i = 0; i < l1; i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if (mp1.containsKey(c1) && mp1.get(c1) != c2)
				return false;
			if (mp2.containsKey(c2) && mp2.get(c2) != c1)
				return false;
			mp1.put(c1, c2);
			mp2.put(c2, c1);
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isomorphic("egg","add"));
	}
}
