package array;

public class A13_Count {
	// Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2 Output: 4
	public static int countFreq(int[] arr, int target) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 1, 2, 2, 2, 2, 3};
		int b = 2;
		System.out.println(countFreq(a, b));
	}
}
/*
def count_freq(arr, target):
    count = 0
    for num in arr:
        if num == target:
            count += 1
    return count

def main():
    arr = [1, 1, 2, 2, 2, 2, 3]
    target = 2
    print("Frequency:", count_freq(arr, target))
if __name__ == "__main__":
    main()


| Approach          | Time                | Space    |
| ----------------- | ------------------- | -------- |
| Loop (Java-style) | **O(n)**            | **O(1)** |
| `list.count()`    | **O(n)**            | **O(1)** |
| `Counter`         | **O(n)** (to build) | **O(n)** |

*/