package string;

public class S32_SameWordCount {
	static void sameWordCount() {
		try {
			String x[] = { "Kanpur", "Farrukhabad", "Kannuaj", "Ghaziabad", "Bangalore", "Mumbai", "Delhi", "Lucknow" };
			String y[] = { "Kanpur", "Kannuaj", "Kannuaj", "Ghaziabad", "Ghaziabad", "Mumbai", "Delhi", "Mau",
					"Lucknow", "Kanpur" };
			String total[] = new String[50];
			String sTotal[] = null;
			for (int i = 0; i < x.length; i++) {
				total[i] = x[i];
			}
			int inc = x.length;
			for (int j = 0; j < y.length; j++) {
				inc++;
				total[inc] = y[j];
			}
			for (int k = 0; k < total.length; k++) {
				int count = 0;
				if (total[k] != null) {
					sTotal = new String[50];
					for (int i = 0; i < total.length; i++) {
						if (total[k] == total[i]) {
							count++;
							if (count <= 1) {
								sTotal[i] = total[k];
							}
						}
					}
					if (sTotal[k] != null) {
						System.out.println(sTotal[k] + "\t" + count);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		sameWordCount();
	}
}