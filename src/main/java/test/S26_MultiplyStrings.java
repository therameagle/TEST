package test;

import java.math.BigInteger;


//Input: s1 = "0033", s2 = "2" Output: "66"

public class S26_MultiplyStrings {
	public static String multiplyStrings(String s1, String s2) {
		BigInteger num1 = new BigInteger(s1);
		BigInteger num2 = new BigInteger(s2);
		BigInteger result = num1.multiply(num2);
		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(multiplyStrings("0033","2"));
	}
}