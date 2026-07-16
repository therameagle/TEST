package array;

import java.util.ArrayList;
import java.util.Arrays;

public class A22_RotateArr {
	// Rotate_Array_by_Times Input: arr[] = [1, 2, 3, 4, 5], d = 2 Output: [3, 4, 5,
	// 1, 2]
	public static void rotateArr(int arr[], int d) {
		int n = arr.length;
		d = d % n;
		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);
		System.out.print(Arrays.toString(arr));
	}

	static void reverse(int[] arr, int st, int end) {
		while (st < end) {
			int temp = arr[st];
			arr[st] = arr[end];
			arr[end] = temp;
			st++;
			end--;
		}
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		int c = 2;
		ArrayList<Long> arr = new ArrayList<>();
		for (int num : a) {
			arr.add((long) num);
		}
		rotateArr(a, c);
	}
}

/*
def reverse(arr, start, end):
    while start < end:
        arr[start], arr[end] = arr[end], arr[start]
        start += 1
        end -= 1

def rotate_arr(arr, d):
    n = len(arr)
    d = d % n
    reverse(arr, 0, d - 1)
    reverse(arr, d, n - 1)
    reverse(arr, 0, n - 1)
    print(arr)

def main():
    arr = [1, 2, 3, 4, 5]
    d = 2
    rotate_arr(arr, d)
if __name__ == "__main__":
    main()
    
| Approach                        | Time     | Space    |
| ------------------------------- | -------- | -------- |
| Reversal Algorithm (Java-style) | **O(n)** | **O(1)** |
| List Slicing                    | **O(n)** | **O(n)** |
    
    
*/