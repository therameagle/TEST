package string;

public class S33_SameCharCount {
	static int sameCharCount(String s1, String s2) {
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if (Character.toLowerCase(c1) == Character.toLowerCase(c2))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(sameCharCount("amit","katiyar"));
	}
}