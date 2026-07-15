package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class A7_MissingNumber {
	// Missing element in second array Input: a[] = [1, 2, 3, 4, 5, 10], b[] = [2,
	// 3, 1, 0, 5] Output: [4, 10]
	public static ArrayList<Integer> findMissing(int[] a, int[] b) {
		ArrayList<Integer> l = new ArrayList<>();
		Set<Integer> s1 = new HashSet<>();
		for (int i : b)
			s1.add(i);
		for (int i : a) {
			if (!s1.contains(i)) {
				l.add(i);
			}
		}
		return l;
	}
	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5, 10 };
		int b[] = new int[] { 2, 3, 1, 0, 5 };
		System.out.println(findMissing(a, b));
	}
}
