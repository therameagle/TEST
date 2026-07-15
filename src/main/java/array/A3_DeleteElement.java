package array;

import java.util.ArrayList;

public class A3_DeleteElement {
	// deleteElement Input: arr[] = [20, 10, 25, 30, 40], k = 2 Output: [25, 30, 40]
	public static ArrayList<Integer> deleteElement(int arr[], int k) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(arr[0]);
		int count = 0, i = 1;
		for (i = 1; i < arr.length; i++) {
			while (arr1.size() != 0 && arr1.get(arr1.size() - 1) < arr[i] && count != k) {
				arr1.remove(arr1.size() - 1);
				count++;
			}
			arr1.add(arr[i]);
		}
		return arr1;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 20, 10, 25, 30, 40 };
		int b = 2;
		System.out.println(deleteElement(a, b));
	}
}
