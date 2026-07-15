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
