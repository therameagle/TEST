package array;

import java.util.ArrayList;
import java.util.Collections;

public class A18_KthElement {
	// Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5 Output: 6
	public static int kthElement(int a[], int b[], int k) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i : a)
			arr.add(i);
		for (int i : b)
			arr.add(i);
		Collections.sort(arr);
		return arr.get(k - 1);
	}

	public static void main(String[] args) {
		int a[] = new int[] { 2, 3, 6, 7, 9 };
		int b[] = new int[] { 1, 4, 8, 10};
		int c = 5;
		System.out.println(kthElement(a,b,c));
	}
}
