package array;

import java.util.ArrayList;

public class A23_Search {
	// Input:  arr = [9, 7, 16, 16, 4], k = 16  Output: 3
	public static int search(ArrayList<Integer> arr, int k) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == k)
				return i + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 9, 7, 16, 16, 4};
		int c = 16;
		ArrayList<Integer> arr = new ArrayList<>();
		for (int num : a) {
			arr.add((Integer) num);
		}
		System.out.println(search(arr, c));
	}
}

/*
def search(arr, k):
    for i in range(len(arr)):
        if arr[i] == k:
            return i + 1      # 1-based indexing (same as Java)
    return -1

def main():
    arr = [9, 7, 16, 16, 4]
    k = 16
    print(search(arr, k))

if __name__ == "__main__":
    main()
    
| Approach             | Time     | Space    |
| -------------------- | -------- | -------- |
| Linear Search (Loop) | **O(n)** | **O(1)** |
| `list.index()`       | **O(n)** | **O(1)** |
    
*/