package array;

public class A8_MissingNumber2 {
	// Missing element in second array Input: a[] = [1, 2, 3, 4, 5, 10], b[] = [2,
	// 3, 1, 0, 5] Output: [4, 10]
	public static int missingNum(int[] arr) {
		int n = arr.length + 1;
		// Iterate from 1 to n and check
		// if the current number is present
		for (int i = 1; i <= n; i++) {
			boolean found = false;
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] == i) {
					found = true;
					break;
				}
			}
			// If the current number is not present
			if (!found)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5, 10 };
		System.out.println(missingNum(a));
	}
}
