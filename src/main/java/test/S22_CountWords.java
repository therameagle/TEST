package test;

public class S22_CountWords {
 //Count number of words
	public static int countWords(String s) {
		s = s.replace("\\n", " ");
		s = s.replace("\\t", " ");
		s = s.replaceAll("[ ]+", " ");
		return s.trim().split(" ").length;
	}


	public static void main(String[] args) {
		System.out.println(countWords("Unified: All of the sentences in a single paragraph should be related to a single controlling idea (often expressed in the topic sentence of the paragraph).\r\n"
				+ "Clearly related to the thesis: The sentences should all refer to the central idea, or thesis, of the paper (Rosen and Behrens 119).\r\n"
				+ "Coherent: The sentences  be arranged in a logical manner and should follow a definite plan for development (Rosen and Behrens 119)."));
	}
}