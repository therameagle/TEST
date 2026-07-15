package test;
//Remove Special Characters
public class S20_RemoveCharsFromFirstStringUsingSecond {
	public static String removeCharsFromFirstStringUsingSecond(String str1, String str2) {
		StringBuilder sb = new StringBuilder(); //String str = "";
		for (int i = 0; i < str1.length(); i++) {
			CharSequence ch = String.valueOf(str1.charAt(i));
			if (str2.contains(ch) == false) {
				sb.append(ch); //str = str + ch;
			}
		}
		return sb.toString();//str;
	}

	public static void main(String[] args) {
		System.out.println(removeCharsFromFirstStringUsingSecond("James","Gosling"));
	}
}