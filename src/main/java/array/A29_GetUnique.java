package array;

public class A29_GetUnique {
	public static void getUnique(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("unique element are: " + arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 7, 11, 3, 8, 11 };
		System.out.println("Array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
		getUnique(arr);
	}
}
