package test;

public class S18_DelAlternate {
	//Delete Alternate Character
	public static String delAlternate(String S) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < S.length(); i++) {
			if (i % 2 == 0) {
				s.append(S.charAt(i));
			}
		}
		return s.toString();
	}


	public static void main(String[] args) {
		System.out.println(delAlternate("Inshallah"));
	}
}