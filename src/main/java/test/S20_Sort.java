package test;

//Sort String
public class S20_Sort {
	public static String sort(String s) {
		StringBuilder sb = new StringBuilder();
		try {
			int[] vis = new int[s.length()];
			for (char ch : s.toCharArray()) {
				vis[ch - 'a']++;
			}
			for (int i = 0; i < s.length(); i++) {
				while (vis[i] > 0) {
					sb.append((char) (i + 'a'));
					vis[i]--;
				}
			}
		} catch (Exception exp) {
			System.out.println(exp);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(sort("String"));
	}
}