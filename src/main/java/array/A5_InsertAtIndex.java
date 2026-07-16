package array;

public class A5_InsertAtIndex {
	// Input: sizeOfArray = 6 arr[] = {1, 2, 3, 4, 5} index = 5, element = 90
	// Output: 1 2 3 4 5 90
	public static void insertAtIndex(int arr[], int sizeOfArray, int index, int element) {
		for (int i = sizeOfArray - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = element;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		int size = 5;
		int index = 5;
		int element = 90;
		insertAtIndex(a, size, index, element);
	}
}


/*
def insert_at_index(arr, size_of_array, index, element):
    # Shift elements to the right
    for i in range(size_of_array - 1, index, -1):
        arr[i] = arr[i - 1]
    # Insert the new element
    arr[index] = element
# Driver code
arr = [1, 2, 3, 4, 5, 0]  # Extra space for insertion
size = 5
index = 5
element = 90
insert_at_index(arr, size, index, element)

print(arr)

| Complexity                  | Value    |
| --------------------------- | -------- |
| **Best Time Complexity**    | **O(1)** |
| **Average Time Complexity** | **O(n)** |
| **Worst Time Complexity**   | **O(n)** |
| **Space Complexity**        | **O(1)** |
*/