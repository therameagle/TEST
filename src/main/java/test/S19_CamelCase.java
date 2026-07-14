package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S19_CamelCase {
	public static List<String> camelCase(String[] arr, String pat) {
		ArrayList<String> result = new ArrayList<>();
		for(int i =0 ; i<arr.length; i++){
			String words = arr[i];
			StringBuilder sb = new StringBuilder();
			for(int j =0; j<words.length();j++){
				char C = words.charAt(j);
				if(Character.isUpperCase(C)){
					sb.append(C);
				}
			}
			if(sb.toString().startsWith(pat)){
				result.add(words);
			}
		}
		Collections.sort(result);
		return result;
	}

	public static void main(String[] args) {
		System.out.println(camelCase(new String[]{"String", "is", "awesome"}, ""));
	}
}