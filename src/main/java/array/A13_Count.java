package array;

public class A13_Count {
	// Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2 Output: 4
	public static int countFreq(int[] arr, int target) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 1, 2, 2, 2, 2, 3};
		int b = 2;
		System.out.println(countFreq(a, b));
	}
}
