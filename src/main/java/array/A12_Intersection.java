package array;

import java.util.ArrayList;
import java.util.HashSet;

public class A12_Intersection {
	// Intersection Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7] Output: 1 2 3
	public static  ArrayList<Integer> intersection(int[] a, int[] b) {
		HashSet<Integer> hash = new HashSet<>();
		for (int i : a) {
			hash.add(i);
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : b) {
			if (hash.contains(i))
				list.add(i);
		}
		return list;
	}


	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		int b[] = new int[] { 2, 3, 1, 6, 7 };
		System.out.println(intersection(a, b));
	}
}
