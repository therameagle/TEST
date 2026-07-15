package array;

import java.util.ArrayList;

public class A41_Alternate_Arrange_Positive_Negative {
	// Alternate_Positive_Negative :: Input: arr[] = [9, 4, -2, -1, 5, 0, -5, -3, 2] Output: [9, -2, 4, -1, 5, -5, 0, -3, 2]
	public static void alternate_Arrange_Positive_Negative(ArrayList<Integer> al) {
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		for (int v : al) {
			if (v >= 0)
				pos.add(v);
			else
				neg.add(v);
		}
		int k = 0;
		for (int i = 0; i < al.size(); i++) {
			if (i < pos.size())
				al.set(k++, pos.get(i));
			if (i < neg.size())
				al.set(k++, neg.get(i));
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(9);
		al.add(4);
		al.add(-2);
		al.add(-1);
		al.add(5);
		al.add(0);
		al.add(-5);
		al.add(-3);
		al.add(2);
		System.out.println("Input: " + al);
		alternate_Arrange_Positive_Negative(al);
		System.out.println("Output: " + al);
	}
}
