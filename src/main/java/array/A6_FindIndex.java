package array;

import java.util.Arrays;

public class A6_FindIndex {
	// Input: arr[] = [1, 2, 3, 4, 5, 5] , key = 5 Output: [4, 5]
		public static int[] findIndex(int arr[], int key) {
			int s = -1, end = -1;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == key) {
					if (s == -1) {
						s = i;
					}
					end = i;
				}
			}
			return new int[] { s, end };
		}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		int key = 5;
		System.out.println(Arrays.toString(findIndex(a, key)));
	}
}
