package test;

//String rotated by 2 place
public class S22_IsRotated {
	public static boolean isRotated(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		if (s1.length() <= 2) {
			return s1.equals(s2);
		}
		String clockwise = s1.substring(2) + s1.substring(0, 2);
		String anticlockwise = s1.substring(s1.length() - 2) + s1.substring(0, s1.length() - 2);
		return s2.equals(clockwise) || s2.equals(anticlockwise);
	}


	public static void main(String[] args) {
		System.out.println(isRotated("String","ngStri"));
	}
}