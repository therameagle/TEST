package test;

public class S24_CamelCase {
	public static void camelCase(String s) {
		System.out.print(s.charAt(0));
		int i = 1;
		while (i < s.length()) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				System.out.print(" " + Character.toLowerCase(s.charAt(i)));
			else
				System.out.print(s.charAt(i));
			i++;
		}
	}

	public static void main(String[] args) {
		camelCase("HiTechCity HelloWorld HiTechLab");	
	}
}