package test;

//index of find first Occurence Input: txt = "GeeksForGeeks", pat = "For" Output: 5
public class S15_FirstOccurence {
	public static int firstOccurence(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		if (l2 == 0) {
			return 0;
		}
		for (int i = 0; i <= l1 - l2; i++) {
			if (s1.substring(i, i + l2).equals(s2)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(firstOccurence("GeeksForGeeks", "For"));
	}
}