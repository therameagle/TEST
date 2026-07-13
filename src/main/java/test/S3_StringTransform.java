package test;

//2a3b3c
public class S3_StringTransform {
	// longest Common PrefixInput: arr[] = ["geeksforgeeks", "geeks", "geek",
	// "geezer"] Output: "gee"
	public static String longestCommonPrefix(String str[]) {
		if (str == null || str.length == 0)
			return "";
		String pre = str[0];
		for (int i = 1; i < str.length; i++) {
			while (!str[i].startsWith(pre)) {
				pre = pre.substring(0, pre.length() - 1);
				if (pre.isEmpty())
					return "";
			}
		}
		return pre;
	}

	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[]{"geeksforgeeks", "geeks", "geek", "geezer"}));
	}
}
