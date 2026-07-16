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

/*
def get_unique(arr):
    for i in range(len(arr)):
        flag = False

        # Check if the current element has appeared before
        for j in range(i):
            if arr[i] == arr[j]:
                flag = True
                break

        if not flag:
            print("Unique element:", arr[i])


# Driver code
arr = [1, 3, 7, 11, 3, 8, 11]

print("Array:")
print(*arr)

print()
get_unique(arr)

| Complexity           | Value     |
| -------------------- | --------- |
| **Time Complexity**  | **O(n²)** |
| **Space Complexity** | **O(1)**  |
*/