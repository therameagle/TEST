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
