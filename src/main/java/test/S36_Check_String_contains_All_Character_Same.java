package test;

public class S36_Check_String_contains_All_Character_Same {
	public static Boolean check_String_contains_All_Character_Same(String s) {
		char a = s.charAt(0);
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (a != ch)
				return false;
			else
				a = ch;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(check_String_contains_All_Character_Same("aaaaaaaaaaaa"));
		System.out.println(check_String_contains_All_Character_Same("0100130"));
	}
}