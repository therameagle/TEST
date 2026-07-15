package string;

public class S25_CamelCaseConvert {
	public static String convertToCamelCase(String s) {
		StringBuilder str = new StringBuilder();
		boolean found = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				found = true;
			} else if (found == true) {
				str.append(Character.toUpperCase(s.charAt(i)));
				found = false;
			} else {
				str.append(s.charAt(i));
			}
		}
		return str.toString();
	}

	public static void main(String[] args) {
		System.out.println(convertToCamelCase("HiTechCity elloWorld iTechLab"));
	}
}