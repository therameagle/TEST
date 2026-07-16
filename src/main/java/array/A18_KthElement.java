package array;

import java.util.ArrayList;
import java.util.Collections;

public class A18_KthElement {
	// Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5 Output: 6
	public static int kthElement(int a[], int b[], int k) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i : a)
			arr.add(i);
		for (int i : b)
			arr.add(i);
		Collections.sort(arr);
		return arr.get(k - 1);
	}

	public static void main(String[] args) {
		int a[] = new int[] { 2, 3, 6, 7, 9 };
		int b[] = new int[] { 1, 4, 8, 10};
		int c = 5;
		System.out.println(kthElement(a,b,c));
	}
}

/*
def kth_element(a, b, k):
    # Merge both lists
    arr = []
    for num in a:
        arr.append(num)
    for num in b:
        arr.append(num)
    # Sort the merged list
    arr.sort()
    # Return the k-th element (1-based indexing)
    return arr[k - 1]

def main():
    a = [2, 3, 6, 7, 9]
    b = [1, 4, 8, 10]
    k = 5
    print("Kth Element:", kth_element(a, b, k))
if __name__ == "__main__":
    main()

| Approach                                   | Time                  | Space      |
| ------------------------------------------ | --------------------- | ---------- |
| Merge + Sort (Java-style)                  | **O((n+m) log(n+m))** | **O(n+m)** |
| `sorted(a+b)`                              | **O((n+m) log(n+m))** | **O(n+m)** |
| Two-Pointer Merge                          | **O(k)**              | **O(1)**   |
| Binary Search (Optimal Interview Solution) | **O(log(min(n,m)))**  | **O(1)**   |

*/
