package array;

import java.util.ArrayList;

public class A23_Search {
	// Input:  arr = [9, 7, 16, 16, 4], k = 16  Output: 3
	public static int search(ArrayList<Integer> arr, int k) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == k)
				return i + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 9, 7, 16, 16, 4};
		int c = 16;
		ArrayList<Integer> arr = new ArrayList<>();
		for (int num : a) {
			arr.add((Integer) num);
		}
		System.out.println(search(arr, c));
	}
}
