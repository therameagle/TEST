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

/*
def longest_subarray(arr, k):
    prefix_sum_map = {}   # Stores {prefix_sum: first_index}
    current_sum = 0
    max_len = 0
    for i in range(len(arr)):
        current_sum += arr[i]
        if current_sum == k:
            max_len = i + 1
        if (current_sum - k) in prefix_sum_map:
            max_len = max(max_len, i - prefix_sum_map[current_sum - k])
        if current_sum not in prefix_sum_map:
            prefix_sum_map[current_sum] = i
    return max_len

def main():
    arr = [10, 5, 2, 7, 1, -10]
    k = 15
    print("Longest Subarray Length:", longest_subarray(arr, k))

if __name__ == "__main__":
    main()
    
  | Approach                | Time     | Space    |
| ----------------------- | -------- | -------- |
| Prefix Sum + Dictionary | **O(n)** | **O(n)** |
 
    
*/