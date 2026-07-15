package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S23_CamelCaseAllPossibleString {
	public static List<String> camelCaseAllPossibleString(String[] arr, String pat) {
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
		System.out.println(camelCaseAllPossibleString(new String[]{"HiTechCity",
                "HelloWorld",
                "HiTechLab",
                "HiTechWorld",
                "HelloTech"}, "HT"));	
	}
}