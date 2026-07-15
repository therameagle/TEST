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
