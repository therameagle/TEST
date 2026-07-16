package array;

import java.util.Arrays;

public class A39_RearrangingRotate {
	// rotate Input: arr[] = [1, 2, 3, 4, 5, 6] Output: [6, 1, 5, 2, 4, 3]
	public static void rearrangeRotate(int arr[]) {
		Arrays.sort(arr);
		int n = arr.length;
		int[] temp = arr.clone();
		int left = 0, right = n - 1;
		boolean flag = true; // true for max, false for min
		for (int i = 0; i < n; i++) {
			if (flag) {
				arr[i] = temp[right--];
			} else {
				arr[i] = temp[left++];
			}
			flag = !flag;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		rearrangeRotate(arr);
		System.out.println(Arrays.toString(arr));
	}
}

/*
def rearrange_rotate(arr):
    # Sort the array
    arr.sort()
    n = len(arr)
    temp = arr[:]
    left = 0
    right = n - 1

    flag = True  # True for maximum, False for minimum
    for i in range(n):
        if flag:
            arr[i] = temp[right]
            right -= 1
        else:
            arr[i] = temp[left]
            left += 1

        flag = not flag

# Driver code
arr = [1, 2, 3, 4, 5, 6]
rearrange_rotate(arr)
print(arr)

		| Complexity           | Value          |
		| -------------------- | -------------- |
		| **Time Complexity**  | **O(n log n)** |
		| **Space Complexity** | **O(n)**       |
*/