package array;

import java.util.ArrayList;
import java.util.Collections;

public class A21_ReverseorSwapInGroupsArray {
	// reverse in group Input: arr[] = [1, 2, 3, 4, 5], k = 3 Output: [3, 2, 1, 5,
	// 4]
	public static void reverseorSwapInGroupsArray(ArrayList<Long> arr, int k) {
		int n = arr.size();
		for (int i = 0; i < n; i += k) {
			int left = i;
			int right = Math.min(i + k - 1, n - 1);
			while (left < right) {
				Collections.swap(arr, left, right);
				left++;
				right--;
			}
		}
	}
	

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		int c = 3;
		ArrayList<Long> arr = new ArrayList<>();
		for (int num : a) {
			arr.add((long) num);
		}
		reverseorSwapInGroupsArray(arr, c);
		System.out.println(arr);
	}
}
