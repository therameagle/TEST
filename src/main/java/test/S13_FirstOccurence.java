package test;

//index of find first Occurence Input: txt = "GeeksForGeeks", pat = "For" Output: 5
public class S13_FirstOccurence {
	public static int firstOccurence(String txt, String pat) {
		int lenTxt = txt.length();
		int lenPat = pat.length();
		if (lenPat == 0) {
			return 0;
		}
		for (int i = 0; i <= lenTxt - lenPat; i++) {
			if (txt.substring(i, i + lenPat).equals(pat)) {
				return i;
			}
		}
		return -1;
	}


	public static void main(String[] args) {
		System.out.println(firstOccurence("GeeksForGeeks", "For"));
	}
}