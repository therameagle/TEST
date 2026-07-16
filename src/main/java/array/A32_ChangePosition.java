package array;

public class A32_ChangePosition {
	public static void changePositions() {
		int temp;
		int a[] = { 1, 2, 3, 4, 5 };
		int n = a.length;
		for (int i = 0; i < n; i++) {
			temp = a[i];
			a[i] = a[(n - i) - 1];
			a[(n - i) - 1] = temp;
			System.out.print(a[i]);
		}
	}

	public static void main(String[] args) {
		changePositions();
	}
}

/*
def change_positions():
    arr = [1, 2, 3, 4, 5]
    n = len(arr)

    for i in range(n):
        temp = arr[i]
        arr[i] = arr[(n - i) - 1]
        arr[(n - i) - 1] = temp
        print(arr[i], end="")


# Driver code
change_positions()

| Complexity           | Value    |
| -------------------- | -------- |
| **Time Complexity**  | **O(n)** |
| **Space Complexity** | **O(1)** |
*/