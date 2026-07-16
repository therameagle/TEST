package array;

public class A19_KthSmallest {
	// Input: a[] = [2, 3, 6, 7, 9], k = 5 Output: 6
	public static int kthSmallest(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr[k - 1];
	}

	public static void main(String[] args) {
		int a[] = new int[] {  6, 7, 9,2, 3, 1};
		int c = 4;
		System.out.println(kthSmallest(a,c));
	}
}

/*
def kth_smallest(arr, k):
    # Sort the array using nested loops (same logic as Java)
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            if arr[j] < arr[i]:
                arr[i], arr[j] = arr[j], arr[i]
    return arr[k - 1]

def main():
    arr = [6, 7, 9, 2, 3, 1]
    k = 4
    print("Kth Smallest Element:", kth_smallest(arr, k))

if __name__ == "__main__":
    main()

| Approach                  | Time           | Space    |
| ------------------------- | -------------- | -------- |
| Nested Loops (Java-style) | **O(n²)**      | **O(1)** |
| `sorted()`                | **O(n log n)** | **O(n)** |
| `heapq.nsmallest()`       | **O(n log k)** | **O(k)** |

*/