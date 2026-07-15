package array;

import java.util.HashMap;
import java.util.Map;

public class A20_LongestSubarray {	
	// Input: arr[] = [10, 5, 2, 7, 1, -10], k = 15 Output: 6
	public static int longestSubarray(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int maxLen = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == k) {
				maxLen = i + 1;
			}
			if (map.containsKey(sum - k)) {
				maxLen = Math.max(maxLen, i - map.get(sum - k));
			}
			if (!map.containsKey(sum)) {
				map.put(sum, i);
			}
		}
		return maxLen;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 10, 5, 2, 7, 1, -10 };
		int c = 15;
		System.out.println(longestSubarray(a, c));
	}
}
