package string;

public class S22_Merge {
	// merge two String
	public static String merge(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		int i = 0, j = 0;
		while (i < s1.length() && j < s2.length()) {
			sb.append(s1.charAt(i));
			sb.append(s2.charAt(j));
			i++;
			j++;
		}
		while (i < s1.length()) {
			sb.append(s1.charAt(i));
			i++;
		}
		while (j < s2.length()) {
			sb.append(s2.charAt(j));
			j++;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(merge("Inshallah","Bismillah"));
	}
}