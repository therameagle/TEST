package array;

public class A2_BinarySearch {
	// BinarySearch Input: arr[] = [1, 2, 3, 4, 5], k = 4 Output: 3
	public static int binarysearch(int[] arr, int k) {
		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == k) {
				ans = mid;
				high = mid - 1;
			} else if (arr[mid] < k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1,2,3,4,5};
		int b = 4;
		System.out.println(binarysearch(a, b));
	}
}
