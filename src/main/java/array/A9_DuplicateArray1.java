package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A9_DuplicateArray1 {
	// find duplicate in array
		public static List<Integer> findDuplicates(int[] arr) {
			ArrayList<Integer> list = new ArrayList<>();
			Arrays.sort(arr);
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] == arr[i + 1]) {
					list.add(arr[i]);
				}
			}
			return list;
		}


	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 3, 5, 10 };
		System.out.println(findDuplicates(a));
	}
}

/*
def find_duplicates(arr):
    result = []
    # Sort the array
    arr.sort()
    # Find adjacent duplicate elements
    for i in range(len(arr) - 1):
        if arr[i] == arr[i + 1]:
            result.append(arr[i])
    return result

# Driver code
arr = [1, 2, 3, 4, 3, 5, 10]
print(find_duplicates(arr))

| Complexity           | Value                       |
| -------------------- | --------------------------- |
| **Time Complexity**  | **O(n log n)**              |
| **Space Complexity** | **O(n)** (including result) |
| **Auxiliary Space**  | **O(1)**                    |

*/