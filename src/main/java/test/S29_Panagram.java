package test;

public class S29_Panagram {
	public static boolean isPanagram(String str) {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			boolean found = false;
			for (int i = 0; i < str.length(); i++) {
				if (ch == Character.toLowerCase(str.charAt(i))) {
					found = true;
					break;
				}
			}
			if (found == false)

				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPanagram("The quick brown fox jumps over the lazy dog"));
	}
}