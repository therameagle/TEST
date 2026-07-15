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
