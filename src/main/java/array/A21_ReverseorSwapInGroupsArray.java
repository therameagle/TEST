package array;

import java.util.ArrayList;
import java.util.Collections;

public class A21_ReverseorSwapInGroupsArray {
	// reverse in group Input: arr[] = [1, 2, 3, 4, 5], k = 3 Output: [3, 2, 1, 5,
	// 4]
	public static void reverseorSwapInGroupsArray(ArrayList<Long> arr, int k) {
		int n = arr.size();
		for (int i = 0; i < n; i += k) {
			int left = i;
			int right = Math.min(i + k - 1, n - 1);
			while (left < right) {
				Collections.swap(arr, left, right);
				left++;
				right--;
			}
		}
	}
	
	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		int c = 3;
		ArrayList<Long> arr = new ArrayList<>();
		for (int num : a) {
			arr.add((long) num);
		}
		reverseorSwapInGroupsArray(arr, c);
		System.out.println(arr);
	}
}


/*
def reverse_or_swap_in_groups(arr, k):
    n = len(arr)
    for i in range(0, n, k):
        left = i
        right = min(i + k - 1, n - 1)
        while left < right:
            arr[left], arr[right] = arr[right], arr[left]
            left += 1
            right -= 1

def main():
    arr = [1, 2, 3, 4, 5]
    k = 3
    reverse_or_swap_in_groups(arr, k)
    print(arr)

if __name__ == "__main__":
    main()

| Approach                  | Time     | Space                      |
| ------------------------- | -------- | -------------------------- |
| Two Pointers (Java-style) | **O(n)** | **O(1)**                   |
| List Slicing              | **O(n)** | **O(k)** (temporary slice) |


*/