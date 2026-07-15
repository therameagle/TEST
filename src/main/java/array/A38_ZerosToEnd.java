package array;

import java.util.Arrays;

public class A38_ZerosToEnd {
	// Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0] Output: [1, 2, 4, 3, 5, 0, 0, 0]
	public static void pushZerosToEnd(int[] arr) {
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[k++] = arr[i];
			}
		}
		for (int j = k; j < arr.length; j++) {
			arr[k++] = 0;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
		pushZerosToEnd(arr);
		System.out.println(Arrays.toString(arr));
	}
}
