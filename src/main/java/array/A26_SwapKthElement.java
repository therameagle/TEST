package array;

import java.util.ArrayList;
import java.util.List;

public class A26_SwapKthElement {
	// Swap Kth element Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 3 Output: [1,
	// 2, 6, 4, 5, 3, 7, 8]
	public static List<Integer> swapKth(List<Integer> arr, int k) {
		int n = arr.size();
		int t = arr.get(k - 1);
		arr.set(k - 1, arr.get(n - k));
		arr.set(n - k, t);
		return arr;
	}
	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8};
		int k=3;
		ArrayList<Integer> arr = new ArrayList<>();
		for (int num : a) {
			arr.add((Integer) num);
		}
		System.out.println(swapKth(arr,k));
	}
}
