package test;

//2a3b3c
public class S3_StringTransform {
	public static String transform(String s) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i += 2) {
			char ch = s.charAt(i);
			int count = s.charAt(i + 1) - '0';
			for (int j = 0; j < count; j++) {
				result.append(ch);
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		System.out.println(transform("a2b3c2"));
	}
}
