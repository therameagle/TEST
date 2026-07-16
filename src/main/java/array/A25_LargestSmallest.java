package array;

import java.util.Arrays;

public class A25_LargestSmallest {
	public static void largestAndSmallest(int[] numbers) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (int number : numbers) {
			if (number > largest) {
				largest = number;
			} else if (number < smallest) {
				smallest = number;
			}
		}
		System.out.println("Given integer array : " + Arrays.toString(numbers));
		System.out.println("Largest number in array is : " + largest);
		System.out.println("Smallest number in array is : " + smallest);
	}

	public static void main(String[] args) {
		int a[] = new int[] { 9, 7, 16, 16, 4};
		largestAndSmallest(a);
	}
}

/*
def largest_and_smallest(numbers):
    largest = float('-inf')
    smallest = float('inf')

    for number in numbers:
        if number > largest:
            largest = number
        if number < smallest:
            smallest = number

    print("Given integer array:", numbers)
    print("Largest number in array is:", largest)
    print("Smallest number in array is:", smallest)


def main():
    arr = [9, 7, 16, 16, 4]
    largest_and_smallest(arr)


if __name__ == "__main__":
    main()
    
    
    | Approach                      | Time     | Space    |
    | ----------------------------- | -------- | -------- |
    | Manual Traversal (Java-style) | **O(n)** | **O(1)** |
    | `max()` + `min()`             | **O(n)** | **O(1)** |
*/