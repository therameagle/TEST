package test;

import java.util.Arrays;

public class S44_ReverseStringPreserveSpace {
	public static void reversePreserveSpace(char str[]) {
		int r = str.length - 1, l = 0;
		while (l < r) {
			if (!Character.isAlphabetic(str[l]))
				l++;
			else if (!Character.isAlphabetic(str[r]))
				r--;
			else {
				char tmp = str[l];
				str[l] = str[r];
				str[r] = tmp;
				l++;
				r--;
			}
		}
		System.out.println("Output string: " + Arrays.toString(str));
	}

	public static void main(String[] args) {
        String input = "a,b$c";
        System.out.println("Input string : " + input);
        reversePreserveSpace(input.toCharArray());
        input = "Ab,c,de!$";
        System.out.println("Input string : " + input);
        reversePreserveSpace(input.toCharArray());
        input = "I love Java!";
        System.out.println("Input string : " + input);
        reversePreserveSpace(input.toCharArray());
    }
}