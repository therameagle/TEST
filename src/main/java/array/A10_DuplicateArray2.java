package array;

public class A10_DuplicateArray2 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 2, 5, 6, 3 };
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println("Duplicate found: " + array[i]);
				}
			}
		}
	}
}

/*
def find_duplicates():
    array = [1, 2, 3, 4, 2, 5, 6, 3]
    for i in range(len(array) - 1):
        for j in range(i + 1, len(array)):
            if array[i] == array[j]:
                print(f"Duplicate found: {array[i]}")
find_duplicates()

O(n)
O(n)
*/