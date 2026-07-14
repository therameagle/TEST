package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//index of find first Occurence Input: txt = "GeeksForGeeks", pat = "For" Output: 5
public class S16_DuplicateOccurenceRepeatiton {
	public static void duplicateOccurenceRepeatiton(String s) {
		int[] c = new int[256]; // Array for ASCII characters
		for (char ch : s.toCharArray()) {
			c[ch]++;
		}
		System.out.println("Character Occurrences:");
		for (int i = 0; i < c.length; i++) {
			if (c[i] > 0) {
				System.out.println((char) i + " : " + c[i]);
			}
		}
	}

	static void duplicateCharacterCount(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		char[] c = str.toCharArray();
		for (char ch : c) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		Set<Character> charSet = map.keySet();
		System.out.println("Duplicate Characters in : " + str);
		for (Character ch : charSet) {
			if (map.get(ch) > 1) {
				System.out.println(ch + " : " + map.get(ch));
			}
		}
	}

	static void printDupsAndSort(String str) {
		System.out.println("Duplicate Characters in : " + str);
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1)
				System.out.println(entry.getKey() + ", " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		duplicateOccurenceRepeatiton("GeeksForGeeks");
		duplicateCharacterCount("GeeksForGeeks");
		printDupsAndSort("GeeksForGeeks");
	}
}