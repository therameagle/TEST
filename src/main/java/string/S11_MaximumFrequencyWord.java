package string;

import java.util.HashMap;

//Most Frequent Word
public class S11_MaximumFrequencyWord {
	public static String maximumFrequencyWord(String str) {
		HashMap<String, Integer> map = new HashMap<>();
		String[] sarr = str.split(" ");
		int maxFreq = 0;
		for (String word : sarr) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		for (int freq : map.values()) {
			maxFreq = Math.max(maxFreq, freq);
		}
		for (String word : sarr) {
			if (map.get(word) == maxFreq) {
				return word + " " + maxFreq;
			}
		}
		return "";
	}
	public static void main(String[] args) {
		System.out.println(maximumFrequencyWord("geeks for English Maths geeks"));
	}
}