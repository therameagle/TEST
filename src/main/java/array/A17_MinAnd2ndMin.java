package array;

import java.util.Arrays;

public class A17_MinAnd2ndMin {
	// First_and_Second_Smallests Input: arr[] = [2, 4, 3, 5, 6] Output: 2 3
	public static int[] minAnd2ndMin(int arr[]) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				return new int[] { arr[i], arr[i + 1] };
			}
		}
		return new int[] { -1 };
	}

	public static void main(String[] args) {
		int a[] = new int[] { 2, 4, 3, 5, 6};
		System.out.println(Arrays.toString(minAnd2ndMin(a)));
	}
}

/*
def min_and_2nd_min(arr):
    # Sort the array
    arr.sort()
    for i in range(len(arr) - 1):
        if arr[i] != arr[i + 1]:
            return [arr[i], arr[i + 1]]

    return [-1]

def main():
    arr = [2, 4, 3, 5, 6]
    print(min_and_2nd_min(arr))

if __name__ == "__main__":
    main()

| Approach                  | Time           | Space                                   |
| ------------------------- | -------------- | --------------------------------------- |
| Sort (Java-style)         | **O(n log n)** | **O(1)** (ignoring sort implementation) |
| `sorted(set(arr))`        | **O(n log n)** | **O(n)**                                |
| Single-pass (Recommended) | **O(n)**       | **O(1)**                                |

*/