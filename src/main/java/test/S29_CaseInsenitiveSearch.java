package test;

import java.util.ArrayList;

//Sort String
public class S29_CaseInsenitiveSearch {
	public static ArrayList<Integer> caseInsenitiveSearch(String txt, String pat) {
		ArrayList<Integer> al = new ArrayList<>();
		int l1 = txt.length();
		int l2 = pat.length();
		for (int i = 0; i < l1 - l2 + 1; i++) {
			boolean found = true;
			for (int j = 0; j < l2; j++) {
				if (Character.toLowerCase(txt.charAt(i + j)) != Character.toLowerCase(pat.charAt(j))) {
					found = false;
					break;
				}
			}
			if (found) {
				al.add(i);
			}
		}
		return al;
	}
 
	public static void main(String[] args) {
		System.out.println(caseInsenitiveSearch("geeksforgeek","gEekF"));
	}
}

