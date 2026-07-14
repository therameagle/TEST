package test;

import java.util.ArrayList;
import java.util.List;

//2a3b3c
public class S6_LongestString {
	public static String longest(List<String> arr) {
		String longest = "";
		for (String str : arr) {
			if (str.length() > longest.length()) {
				longest = str;
			}
		}
		return longest;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ashish");
		list.add("Kamel");
		list.add("himeshi");
		list.add("Gauri");
		System.out.println(longest(list));
	}
}