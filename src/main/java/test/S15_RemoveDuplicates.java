package test;

//index of find first Occurence Input: txt = "GeeksForGeeks", pat = "For" Output: 5
public class S15_RemoveDuplicates {
	public static String removeDuplicates(String str) {
		String s = str.toLowerCase();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (sb.indexOf(String.valueOf(ch)) == -1) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(removeDuplicates("GeeksForgeeks"));
		System.out.println(removeDuplicates("1234422"));
	}
}