package array;

import java.util.ArrayList;
import java.util.Collections;

public class A27_AddIncrement{
	// ArraySum add k = 3 arr[] = {1, 2, 4} Output:1 2 5
	public static ArrayList<Integer> add_Increment(ArrayList<Integer> arr, int N) {
		ArrayList<Integer> result = new ArrayList<>();
		int carry = 1;
		for (int i = N - 1; i >= 0; i--) {
			int sum = arr.get(i) + carry;
			result.add(sum % 10);
			carry = sum / 10;
		}
		if (carry > 0) {
			result.add(carry);
		}
		Collections.reverse(result);
		return result;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 4};
		int k=3;
		ArrayList<Integer> arr = new ArrayList<>();
		for (int num : a) {
			arr.add((Integer) num);
		}
		System.out.println(add_Increment(arr,k));
	}
}

/*
def add_increment(arr):
    result = []
    carry = 1  # Increment by 1
    for i in range(len(arr) - 1, -1, -1):
        total = arr[i] + carry
        result.append(total % 10)
        carry = total // 10
    if carry > 0:
        result.append(carry)

    # Reverse to restore the correct order
    result.reverse()
    return result
# Driver code
arr = [1, 2, 4]
print(add_increment(arr))

Overall Time Complexity: O(n)
Overall Space Complexity: O(n)

*/