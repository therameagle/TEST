package array;

import java.util.ArrayList;
import java.util.HashSet;

public class A16_RemoveDuplicate {
	// Input: arr[] = [1, 2, 3, 1, 4, 2] Output: [1, 2, 3, 4]
	public static ArrayList<Integer> remove_Duplicate(int arr[]) {
		HashSet<Integer> hs = new HashSet<>();
		ArrayList<Integer> al = new ArrayList<>();
		for (int i : arr) {
			if (hs.add(i))
				al.add(i);
		}
		return al;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 1, 4, 2 };
		System.out.println(remove_Duplicate(a));
	}
}

/*
def remove_duplicate(arr):
    seen = set()
    result = []
    for num in arr:
        if num not in seen:
            seen.add(num)
            result.append(num)
    return result
def main():
    arr = [1, 2, 3, 1, 4, 2]
    print("After Removing Duplicates:", remove_duplicate(arr))
if __name__ == "__main__":
    main()

| Approach                | Time     | Space    |
| ----------------------- | -------- | -------- |
| Set + List (Java-style) | **O(n)** | **O(n)** |
| `dict.fromkeys()`       | **O(n)** | **O(n)** |
| `set()` only            | **O(n)** | **O(n)** |

*/