package test;
//Remove Special Characters
public class S21_RemoveConsecutiveCharacter {
	public static String removeConsecutiveCharacter(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (sb.length() == 0 || sb.charAt(sb.length() - 1) != ch) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(removeConsecutiveCharacter("Jaames"));
	}
}