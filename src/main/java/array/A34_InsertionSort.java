package array;

public class A34_InsertionSort {
	public static void insertion_Sort(int[] a, int n) {
		int i, j, temp;
		for (i = 0; i < n; i++) {
			temp = a[i];
			j = i - 1;
			while (j >= 0 && temp < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int[] a = { 12, 11, 13, 5, 6 };
		int n = a.length;
		insertion_Sort(a, n);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
