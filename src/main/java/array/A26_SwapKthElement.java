package array;

import java.util.ArrayList;
import java.util.List;

public class A26_SwapKthElement {
	// Swap Kth element Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 3 Output: [1,
	// 2, 6, 4, 5, 3, 7, 8]
	public static List<Integer> swapKth(List<Integer> arr, int k) {
		int n = arr.size();
		int t = arr.get(k - 1);
		arr.set(k - 1, arr.get(n - k));
		arr.set(n - k, t);
		return arr;
	}
	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8};
		int k=3;
		ArrayList<Integer> arr = new ArrayList<>();
		for (int num : a) {
			arr.add((Integer) num);
		}
		System.out.println(swapKth(arr,k));
	}
}

/*
def swap_kth(arr, k):
    n = len(arr)
    arr[k - 1], arr[n - k] = arr[n - k], arr[k - 1]
    return arr

def main():
    arr = [1, 2, 3, 4, 5, 6, 7, 8]
    k = 3
    print(swap_kth(arr, k))
if __name__ == "__main__":
    main()
    
    | Approach            | Time     | Space    |
    | ------------------- | -------- | -------- |
    | Swap using indexing | **O(1)** | **O(1)** |
*/