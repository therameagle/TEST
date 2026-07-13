package test;
//2a3b3c
public class S3_StringTransform {
	public static String transform(String S) {
		StringBuffer sb = new StringBuffer();
		int count = 1;
		for (int i = 1; i < S.length(); i++) {
			if (Character.toLowerCase(S.charAt(i)) == Character.toLowerCase(S.charAt(i - 1))) {
				count++;
			} else {
				sb.append(count).append(Character.toLowerCase(S.charAt(i - 1)));
				count = 1;
			}
		}
		sb.append(count).append(Character.toLowerCase(S.charAt(S.length() - 1)));
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(transform("aabbbccc"));
	}
}
