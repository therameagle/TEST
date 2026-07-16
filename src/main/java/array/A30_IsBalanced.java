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

/*
def is_balanced_parentheses_checker(s):
    stack = []
    for ch in s:
        if ch in "([{":
            stack.append(ch)
        elif ch == ']' and stack and stack[-1] == '[':
            stack.pop()
        elif ch == '}' and stack and stack[-1] == '{':
            stack.pop()
        elif ch == ')' and stack and stack[-1] == '(':
            stack.pop()
        else:
            return False
    return len(stack) == 0
# Driver code
test_cases = [
    "()",
    "()[]{}",
    "([{}])",
    "([)]",
    "{[}]",
    "([)])",
    "",
    "((()))",
    "[{()}]"
]

for test in test_cases:
    result = is_balanced_parentheses_checker(test)
    print(f'String: "{test}" -> Balanced: {result}')
    
    | Complexity           | Value    |
    | -------------------- | -------- |
    | **Time Complexity**  | **O(n)** |
    | **Space Complexity** | **O(n)** |
*/