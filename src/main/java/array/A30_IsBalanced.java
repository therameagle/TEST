package array;

import java.util.Stack;

public class A30_IsBalanced {
	public boolean isBalancedParenthes_is_Checker(String s) {
		Stack<Character> st = new Stack<>();
		for (char ch : s.toCharArray()) {
			if (ch == '[' || ch == '{' || ch == '(') {
				st.push(ch);
			} else if (ch == ']' && !st.isEmpty() && st.peek() == '[') {
				st.pop();
			} else if (ch == '}' && !st.isEmpty() && st.peek() == '{') {
				st.pop();
			} else if (ch == ')' && !st.isEmpty() && st.peek() == '(') {
				st.pop();
			} else {
				return false;
			}
		}
		return st.isEmpty();
	}

	public static void main(String[] args) {
		A30_IsBalanced checker = new A30_IsBalanced();

		// Test cases
		String[] testCases = { "()", "()[]{}", "([{}])", "([)]", "{[}]", "([)])", "", "((()))", "[{()}]" };

		for (String test : testCases) {
			boolean result = checker.isBalancedParenthes_is_Checker(test);
			System.out.println("String: \"" + test + "\" -> Balanced: " + result);
		}
	}
}
