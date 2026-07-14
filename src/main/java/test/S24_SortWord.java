package test;

//Sort String
public class S24_SortWord {
	public static void wordSort() {
		String[] st = { "Mumbai", "Delhi", "Kolkata", "Ahmedabad", "Banglore", "Pune" };
		String temp = null;
		int l = st.length;
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (st[j].compareTo(st[i]) < 0) {
					temp = st[i];
					st[i] = st[j];
					st[j] = temp;
				}
			}
		}
		for (int i = 0; i < l; i++) {
			System.out.println(st[i]);
		}
	}
	public static void main(String[] args) {
		wordSort();
	}
}

