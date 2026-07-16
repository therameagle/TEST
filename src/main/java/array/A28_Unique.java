package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class A28_Unique {
	// Uniques complete {1, 3, 7, 11, 3, 8, 11} to {1, 7, 8 };
	public static List<Integer> unique() {
		int[] input = { 1, 3, 7, 11, 3, 8, 11 };
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (int num : input) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}
		List<Integer> result = new ArrayList<>();
		for (int num : input) {
			if (frequencyMap.get(num) == 1) {
				result.add(num);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> result = unique();
		System.out.println("Unique elements: " + result);
	}
}

/*
def unique():
    input_arr = [1, 3, 7, 11, 3, 8, 11]
    # Count the frequency of each element
    frequency = {}
    for num in input_arr:
        frequency[num] = frequency.get(num, 0) + 1
    # Collect elements that appear only once
    result = []
    for num in input_arr:
        if frequency[num] == 1:
            result.append(num)
    return result

# Driver code
result = unique()
print("Unique elements:", result)

| Operation            | Complexity |
| -------------------- | ---------- |
| **Time Complexity**  | **O(n)**   |
| **Space Complexity** | **O(n)**   |

*/