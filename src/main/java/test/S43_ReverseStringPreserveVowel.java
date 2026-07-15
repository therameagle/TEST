package test;

public class S43_ReverseStringPreserveVowel {
	static boolean isVowel(char ch) {
		return "aeiou".indexOf(ch) != -1;
	}
	static String reverseVowel(String str) {
		char[] c = str.toCharArray();
		int i = 0, j = c.length - 1;
		while (i < j) {
			while (i < j && !isVowel(c[i]))
				i++;
			while (i < j && !isVowel(c[j]))
				j--;
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i++;
			j--;
		}
		return new String(c);
	}
	public static void main(String[] args) {
		System.out.println(reverseVowel("ashsih"));
	}
}