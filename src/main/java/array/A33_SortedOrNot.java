package array;

public class A33_SortedOrNot {
	boolean array_SortedOrNot(int[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		A33_SortedOrNot obj = new A33_SortedOrNot();
		int[] arr = { 1, 2, 3, 4, 5 };
		if (obj.array_SortedOrNot(arr))
			System.out.println("Array is sorted");
		else
			System.out.println("Array is not sorted");
	}
}
/*
def array_sorted_or_not(arr):
    for i in range(1, len(arr) - 1):
        if arr[i] > arr[i + 1]:
            return False
    return True

# Driver code
arr = [1, 2, 3, 4, 5]
if array_sorted_or_not(arr):
    print("Array is sorted")
else:
    print("Array is not sorted")

| Complexity                    | Value    |
| ----------------------------- | -------- |
| **Time Complexity (Best)**    | **O(1)** |
| **Time Complexity (Average)** | **O(n)** |
| **Time Complexity (Worst)**   | **O(n)** |
| **Space Complexity**          | **O(1)** |
*/