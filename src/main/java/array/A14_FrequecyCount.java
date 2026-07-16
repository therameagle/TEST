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

/*
def frequency_count(arr):
    # Create a frequency array of size len(arr) + 1
    freq = [0] * (len(arr) + 1)

    # Count the frequency of each element
    for num in arr:
        freq[num] += 1

    # Return frequencies from index 1 onwards
    return freq[1:]


def main():
    arr = [1, 1, 2, 2, 2, 2, 3]
    print(frequency_count(arr))
  
if __name__ == "__main__":
    main()
    
    
    
| Approach                     | Time     | Space    |
| ---------------------------- | -------- | -------- |
| Frequency array (Java-style) | **O(n)** | **O(n)** |
| `Counter`                    | **O(n)** | **O(n)** |

 */