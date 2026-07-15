package array;

import java.util.HashMap;
import java.util.Map;

public class A15_NonRepeatingNumber {
	// Input: arr[] = [-1, 2, -1, 3, 2] Output: 3
	public static int firstNonRepeating(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		for (int i : arr) {
			if (map.get(i) == 1)
				return i;
		}
		return 0;
	}

	public static void main(String[] args) {
		int a[] = new int[] {-1, 2, -1, 3, 2 };
		System.out.println(firstNonRepeating(a));
	}
}
