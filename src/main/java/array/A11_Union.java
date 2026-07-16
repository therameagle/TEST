package array;

import java.util.ArrayList;
import java.util.TreeSet;

public class A11_Union {
	// find union Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7] Output: [1, 2, 3, 4, 5, 6, 7]
	public static ArrayList<Integer> findUnion(int a[], int b[]) {
		TreeSet<Integer> set = new TreeSet<>();
		for (int num : a) {
			set.add(num);
		}
		for (int num : b) {
			set.add(num);
		}
		return new ArrayList<>(set);
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		int b[] = new int[] { 2, 3, 1, 6, 7 };
		System.out.println(findUnion(a, b));

	}
}

/*
def find_union(a, b):
    return sorted(set(a).union(set(b)))

def main():
    a = [1, 2, 3, 4, 5]
    b = [2, 3, 1, 6, 7]
    print("Union:", find_union(a, b))

if __name__ == "__main__":
    main()

Time: O((n + m) log(n + m)) due to sorting.
Space: O(n + m).
*/