package array;

import java.util.ArrayList;
import java.util.HashSet;

public class A12_Intersection {
	// Intersection Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7] Output: 1 2 3
	public static  ArrayList<Integer> intersection(int[] a, int[] b) {
		HashSet<Integer> hash = new HashSet<>();
		for (int i : a) {
			hash.add(i);
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : b) {
			if (hash.contains(i))
				list.add(i);
		}
		return list;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		int b[] = new int[] { 2, 3, 1, 6, 7 };
		System.out.println(intersection(a, b));
	}
}

/*
def intersection(a, b):
    # Store elements of the first list in a set
    hash_set = set(a)
    # Find common elements
    result = []
    for num in b:
        if num in hash_set:
            result.append(num)
    return result

def main():
    a = [1, 2, 3, 4, 5]
    b = [2, 3, 1, 6, 7]
    print("Intersection:", intersection(a, b))
if __name__ == "__main__":
    main()

Java-style implementation: O(n + m)
Building the set: O(n)
Checking elements from the second list: O(m)
Space Complexity: O(n)
*/