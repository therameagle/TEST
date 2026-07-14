package test;

//Sort String
public class S21_Sort {
	public static String sort(String s) {
	    int[] freq = new int[26];
	    StringBuilder sb = new StringBuilder();
	    for (char ch : s.toCharArray()) {
	        freq[ch - 'a']++;
	    }
	    for (int i = 0; i < 26; i++) {
	        while (freq[i] > 0) {
	            sb.append((char) (i + 'a'));
	            freq[i]--;
	        }
	    }
	    return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(sort("dcba"));      // abcd
		System.out.println(sort("banana"));    // aaabnn
		System.out.println(sort("leetcode"));  // cdeeelot
	}
}

/*
  String sort(String s) {
    return s.chars()
            .sorted()
            .collect(StringBuilder::new,
                     StringBuilder::appendCodePoint,
                     StringBuilder::append)
            .toString();
}
*/