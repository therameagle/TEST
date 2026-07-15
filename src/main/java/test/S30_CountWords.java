package test;

import java.util.ArrayList;

public class S30_CountWords {
 //Count number of words
	static void wordCount() {
		String s1[] = { "murli", "nirmal", "abbas", "kiran", "kiran", "nirmal", "asdg", "murli", "nirmal", "abbas",
				"kiran", "kiran", "nirmal", "murli", "kiran" };
		int count, l = s1.length;
		ArrayList<String> a1 = new ArrayList<String>();
		for (int i = 0; i < l - 1; i++) {
			if (!a1.contains(s1[i])) {
				count = 1;
				for (int j = i + 1; j < l - 1; j++) {
					if (s1[i] == s1[j]) {
						count++;
					}
					a1.add(s1[i]);
				}
				System.out.println(s1[i] + "-" + count);
			}
		}
	}
	public static void main(String[] args) {
		wordCount();
	}
}