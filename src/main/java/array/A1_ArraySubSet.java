package array;

import java.util.HashMap;
import java.util.Map;

public class A1_ArraySubSet {
	// Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7] Output: true
		public static boolean arraySubset(int a[], int b[]) {
			Map<Integer, Integer> freq = new HashMap<>();
			for (int num : a) {
				freq.put(num, freq.getOrDefault(num, 0) + 1);
			}
			for (int num : b) {
				if (!freq.containsKey(num) || freq.get(num) == 0) {
					return false;
				}
				freq.put(num, freq.get(num) - 1);
			}
			return true;
		}

	
	public static void main(String[] args) {
		int a[]= new int[] {11, 7, 1, 13, 21, 3, 7, 3};
		int b[]= new int[] {11, 3, 7, 1, 7};
		System.out.println(arraySubset(a,b));
	}
}
