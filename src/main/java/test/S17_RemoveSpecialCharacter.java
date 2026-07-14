package test;
//Remove Special Characters
public class S17_RemoveSpecialCharacter {
	public static String removeSpecialCharacter(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
				sb.append(c);
			}
		}
		if (sb.length() == 0) {
			return "-1";
		}
		return sb.toString();
		/*
		 * String result = s.replaceAll("[^a-zA-Z]",""); return result.isEmpty() ? "-1"
		 * : result;
		 */
	}

	public static void main(String[] args) {
		System.out.println(removeSpecialCharacter("[^a-zA-Z]"));
	}
}