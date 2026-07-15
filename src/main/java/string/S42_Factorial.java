package string;

import java.math.BigInteger;
import java.util.ArrayList;

public class S42_Factorial {
	public static ArrayList<Integer> factorial(int n) {
		ArrayList<Integer> resultElements = new ArrayList<>();
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		String resultStr = result.toString();
		for (int i = 0; i < resultStr.length(); i++) {
			resultElements.add(resultStr.charAt(i) - '0');
		}
		return resultElements;
	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
}