package test;

public class S23_BinaryOrNot {
	public static boolean isBinary(String s) {
		char[] c = s.toCharArray();
		for (char ch : c) {
			if (ch != '1' && ch != '0') {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isBinary("0100100"));
		System.out.println(isBinary("0100130"));
	}
}