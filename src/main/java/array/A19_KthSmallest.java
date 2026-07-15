package array;

public class A19_KthSmallest {
	// Input: a[] = [2, 3, 6, 7, 9], k = 5 Output: 6
	public static int kthSmallest(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr[k - 1];
	}

	public static void main(String[] args) {
		int a[] = new int[] {  6, 7, 9,2, 3, 1};
		int c = 4;
		System.out.println(kthSmallest(a,c));
	}
}
