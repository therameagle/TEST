package array;

import java.util.ArrayList;
import java.util.Collections;

public class A27_AddIncrement{
	// ArraySum add k = 3 arr[] = {1, 2, 4} Output:1 2 5
	public static ArrayList<Integer> add_Increment(ArrayList<Integer> arr, int N) {
		ArrayList<Integer> result = new ArrayList<>();
		int carry = 1;
		for (int i = N - 1; i >= 0; i--) {
			int sum = arr.get(i) + carry;
			result.add(sum % 10);
			carry = sum / 10;
		}
		if (carry > 0) {
			result.add(carry);
		}
		Collections.reverse(result);
		return result;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 4};
		int k=3;
		ArrayList<Integer> arr = new ArrayList<>();
		for (int num : a) {
			arr.add((Integer) num);
		}
		System.out.println(add_Increment(arr,k));
	}
}
