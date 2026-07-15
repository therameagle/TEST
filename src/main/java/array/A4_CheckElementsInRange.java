package array;

public class A4_CheckElementsInRange {
	// Input: n = 7, a = 2, b = 5, arr[] = {1, 4, 5, 2, 7, 8, 3} Output: True
		public static boolean checkElementsInRange(int arr[], int n, int a, int b) {
			int count = 0;
			for (int i = a; i <= b; i++) {
				for (int j = 0; j < n; j++) {
					if (arr[j] == i) {
						count++;
						break;
					}
				}
			}
			return count == b - a + 1;
		}

	public static void main(String[] args) {
		int arr[] = new int[] {1, 4, 5, 2, 7, 8, 3};
		int a = 2;
		int b = 5;
		int n = 7;
		System.out.println(checkElementsInRange(arr,n,a, b));
	}
}
