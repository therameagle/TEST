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
