package test;

//Most Frequent Character
public class S11_MaxOccuringCharAndDigit {
	public static char getMaxOccuringChar(String s) {
		int freq[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
		}
		int max = 0;
		for (int i = 0; i < 26; i++) {
			if (freq[i] > freq[max]) {
				max = i;
			}
		}
		return (char) (max + 'a');
	}
	public static String getMaxOccuringDigit(String N) {
		int[] freq = new int[10];
		for (char c : N.toCharArray()) {
			freq[c - '0']++;
		}
		int maxFreq = 0, result = 0;
		for (int i = 0; i < 10; i++) {
			if (freq[i] >= maxFreq) {
				maxFreq = freq[i];
				result = i;
			}
		}
		return String.valueOf(result);
	}
	public static void main(String[] args) {
		System.out.println(getMaxOccuringChar("geeksforgeeks"));
		System.out.println(getMaxOccuringDigit("103220353"));
	}
}