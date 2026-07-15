package string;

//2a3b3c
public class S35_ToLower {
	public static String toLower(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);

			}
			sb.append(ch);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(toLower("ShakTiMan"));
	}
}
