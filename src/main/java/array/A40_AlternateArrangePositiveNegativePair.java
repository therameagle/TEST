package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A40_AlternateArrangePositiveNegativePair {
	// Input: arr[] = [1, -3, 2, 3, 6, -1, -3, 3] Output: [-1, 1, -3, 3, -3, 3]
	public static List<Integer> posNeg_Arrange_Pair(int[] arr) {
		Arrays.sort(arr);
		List<Integer> lis1 = new ArrayList<>();
		int i = 0, j = 0;
		while (arr[j] < 0)
			j++;
		i = j - 1;
		while (i >= 0 && j < arr.length) {
			if (Math.abs(arr[i]) == arr[j]) {
				lis1.add(arr[i]);
				lis1.add(arr[j]);
				i--;
				j++;
			} else if (Math.abs(arr[i]) < arr[j]) {
				i--;
			} else
				j++;
		}
		return lis1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, -3, 2, 3, 6, -1, -3, 3 };
		System.out.println(posNeg_Arrange_Pair(arr));
	}
}

/*
def pos_neg_arrange_pair(arr):
    # Sort the array
    arr.sort()
    result = []
    i = 0
    j = 0
    # Find the first positive element
    while j < len(arr) and arr[j] < 0:
        j += 1
    # i points to the last negative element
    i = j - 1
    while i >= 0 and j < len(arr):
        if abs(arr[i]) == arr[j]:
            result.append(arr[i])
            result.append(arr[j])
            i -= 1
            j += 1
        elif abs(arr[i]) < arr[j]:
            i -= 1
        else:
            j += 1
    return result

# Driver code
arr = [1, -3, 2, 3, 6, -1, -3, 3]
print(pos_neg_arrange_pair(arr))

| Complexity           | Value          |
| -------------------- | -------------- |
| **Time Complexity**  | **O(n log n)** |
| **Space Complexity** | **O(n)**       |
*/