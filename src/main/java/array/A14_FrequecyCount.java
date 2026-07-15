package array;

import java.util.ArrayList;
import java.util.List;

public class A14_FrequecyCount {
	public static List<Integer> frequency_Count(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		int[] a = new int[arr.length + 1];
		for (int i : arr) {
			a[i]++;
		}
		for (int i = 1; i < a.length; i++) {
			list.add(a[i]);
		}
		return list;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 1, 2, 2, 2, 2, 3};
		System.out.println(frequency_Count(a));
	}
}
