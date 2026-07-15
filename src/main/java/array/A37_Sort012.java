package array;

import java.util.Arrays;

public class A37_Sort012 {
	// sort Input: arr[] = [0, 1, 2, 0, 1, 2] Output: [0, 0, 1, 1, 2, 2]
	public static void sort_012(int[] arr) {
		int n = arr.length;
		int cnt0 = 0, cnt1 = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0)
				cnt0++;
			else if (arr[i] == 1)
				cnt1++;
		}
		for (int i = 0; i < cnt0; i++) {
			arr[i] = 0;
		}
		for (int i = cnt0; i < cnt0 + cnt1; i++) {
			arr[i] = 1;
		}
		for (int i = cnt0 + cnt1; i < n; i++) {
			arr[i] = 2;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 1, 2 };
		sort_012(arr);
	}
}
