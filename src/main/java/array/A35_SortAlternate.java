package array;

import java.util.ArrayList;
import java.util.Arrays;

public class A35_SortAlternate {
	// Alternate_Positive_Negative :: Input: arr[] = [7, 1, 2, 3, 4, 5, 6] Output:
	// [7, 1, 6, 2, 5, 3, 4]
	public static ArrayList<Integer> alternate_Sort(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		int s = 0, end = n - 1;
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				result.add(arr[end--]);
			} else {
				result.add(arr[s++]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 7, 1, 2, 3, 4, 5, 6 };
		System.out.println(alternate_Sort(arr));
	}
}

/*
def alternate_sort(arr):
    # Sort the array
    arr.sort()
    n = len(arr)
    start = 0
    end = n - 1
    result = []
    for i in range(n):
        if i % 2 == 0:
            result.append(arr[end])
            end -= 1
        else:
            result.append(arr[start])
            start += 1
    return result

# Driver code
arr = [7, 1, 2, 3, 4, 5, 6]
print(alternate_sort(arr))

| Complexity           | Value          |
| -------------------- | -------------- |
| **Time Complexity**  | **O(n log n)** |
| **Space Complexity** | **O(n)**       |
*/