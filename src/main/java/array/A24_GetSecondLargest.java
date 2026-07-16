package array;

public class A24_GetSecondLargest {
	// Second Highest and third highest number
	public static int getSecondLargest(int[] arr) { // code here
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		int secondlargest = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondlargest && arr[i] != largest) {
				secondlargest = arr[i];
			}
		}
//			int thirdLargest = -2;
//			for (int i = 0; i < arr.length; i++) {
//				if (arr[i] > thirdLargest && arr[i] != largest) {
//					thirdLargest = arr[i];
//				}
//			}		
		return secondlargest;
//			return thirdlargest;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 9, 7, 16, 16, 4};
		System.out.println(getSecondLargest(a));
	}
}

/*

def get_second_largest(arr):
    # Find the largest element
    largest = arr[0]
    for num in arr:
        if num > largest:
            largest = num

    # Find the second largest element
    second_largest = -1
    for num in arr:
        if num > second_largest and num != largest:
            second_largest = num
    return second_largest

def main():
    arr = [9, 7, 16, 16, 4]
    print("Second Largest:", get_second_largest(arr))
if __name__ == "__main__":
    main()

| Approach                | Time           | Space    |
| ----------------------- | -------------- | -------- |
| Two Passes (Java-style) | **O(n)**       | **O(1)** |
| Single Pass             | **O(n)**       | **O(1)** |
| `sorted(set(arr))`      | **O(n log n)** | **O(n)** |

*/