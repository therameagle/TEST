package string;

import java.util.LinkedHashMap;
import java.util.Map;

//Non Repeating Character Input: s = "geeksforgeeks" Output: 'f'
public class S14_FirstRepeating {
	public static char nonRepeatingChar(String s) {
		Map<Character, Integer> freqMap = new LinkedHashMap<>();
		for (char ch : s.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return '$';
	}

	public static void main(String[] args) {
		System.out.println(nonRepeatingChar("geeksforgeeks"));
	}
}