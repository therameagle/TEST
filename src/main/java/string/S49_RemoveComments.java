package string;

public class S49_RemoveComments {
	// Remove Comments
	String removeComments(String code) {
		int c = code.indexOf("//");
		int c1 = code.indexOf("\\n");
		if (c != -1 && c1 != -1)
			code = code.substring(0, c) + code.substring(c1 + 2);
		c = code.indexOf("/*");
		c1 = code.indexOf("*/");
		if (c != -1 && c1 != -1)
			code = code.substring(0, c) + code.substring(c1 + 2);
		return code;
	}

}
