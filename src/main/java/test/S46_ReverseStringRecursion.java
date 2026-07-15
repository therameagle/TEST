package test;

public class S46_ReverseStringRecursion {
	public static String reverseRecursion(String str) {
	    if (str.isEmpty())
	        return str;
	    return reverseRecursion(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		System.out.println(reverseRecursion("abc"));
	}
}