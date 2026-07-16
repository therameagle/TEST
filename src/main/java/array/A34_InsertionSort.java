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

/*
def insertion_sort(a, n):
    for i in range(n):
        temp = a[i]
        j = i - 1
        while j >= 0 and temp < a[j]:
            a[j + 1] = a[j]
            j -= 1
        a[j + 1] = temp

# Driver code
a = [12, 11, 13, 5, 6]
n = len(a)

insertion_sort(a, n)

for i in range(n):
    print(a[i], end=" ")

| Complexity                  | Value     |
| --------------------------- | --------- |
| **Best Time Complexity**    | **O(n)**  |
| **Average Time Complexity** | **O(n²)** |
| **Worst Time Complexity**   | **O(n²)** |
| **Space Complexity**        | **O(1)**  |
*/