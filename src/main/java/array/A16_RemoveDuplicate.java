package array;

import java.util.ArrayList;
import java.util.HashSet;

public class A16_RemoveDuplicate {
	// Input: arr[] = [1, 2, 3, 1, 4, 2] Output: [1, 2, 3, 4]
	public static ArrayList<Integer> remove_Duplicate(int arr[]) {
		HashSet<Integer> hs = new HashSet<>();
		ArrayList<Integer> al = new ArrayList<>();
		for (int i : arr) {
			if (hs.add(i))
				al.add(i);
		}
		return al;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 1, 4, 2 };
		System.out.println(remove_Duplicate(a));
	}
}
