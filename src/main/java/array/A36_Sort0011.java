package array;

import java.util.Arrays;

public class A36_Sort0011 {
	// sort Input: arr[] = [0, 0, 1, 1, 0] Output: [0, 0, 0, 1, 1]
	public static void sort_010(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				int a = arr[i];
				arr[i] = arr[j];
				arr[j] = a;
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 0, 1, 1, 0 };
		sort_010(arr);
		System.out.println(Arrays.toString(arr));
	}
}

/*
def sort_010(arr):
    j = 0

    for i in range(len(arr)):
        if arr[i] == 0:
            arr[i], arr[j] = arr[j], arr[i]
            j += 1
# Driver code
arr = [0, 0, 1, 1, 0]
sort_010(arr)
print(arr)

| Complexity           | Value    |
| -------------------- | -------- |
| **Time Complexity**  | **O(n)** |
| **Space Complexity** | **O(1)** |
*/