package array;

import java.util.ArrayList;
import java.util.TreeSet;

public class A11_Union {
	// find union Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7] Output: [1, 2, 3, 4, 5, 6, 7]
	public static ArrayList<Integer> findUnion(int a[], int b[]) {
		TreeSet<Integer> set = new TreeSet<>();
		for (int num : a) {
			set.add(num);
		}
		for (int num : b) {
			set.add(num);
		}
		return new ArrayList<>(set);
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		int b[] = new int[] { 2, 3, 1, 6, 7 };
		System.out.println(findUnion(a, b));

	}
}
