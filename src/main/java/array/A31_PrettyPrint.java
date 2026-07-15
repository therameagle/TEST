package array;

import java.util.Arrays;

public class A31_PrettyPrint {
	// Sum of numbers equals to given numbers
	public static void printPairs(int[] array, int sum) {
		for (int i = 0; i < array.length; i++) {
			int first = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int second = array[j];
				if ((first + second) == sum) {
					System.out.printf("(%d, %d) %n", first, second);
				}
			}
		}
	}

	public static void prettyPrint(int[] givenArray, int givenSum) {
		System.out.println("Given array : " + Arrays.toString(givenArray));
		System.out.println("Given sum : " + givenSum);
		System.out.println("Integer numbers, whose sum is equal to value : " + givenSum);
		printPairs(givenArray, givenSum);
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, -1, 5 };
		int sum1 = 6;
		prettyPrint(array1, sum1);

		System.out.println("\n----------------------------\n");

		int[] array2 = { 2, 3, 4, 5, 6, 7, 8 };
		int sum2 = 10;
		prettyPrint(array2, sum2);
	}
}
