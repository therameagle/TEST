package array;
import java.util.*;

public class A43_CommonCharactersInArrayString {

    public static List<Character> findCommonCharacters(String[] words) {
        List<Character> result = new ArrayList<>();
        if (words == null || words.length == 0) {
            return result;
        }
        Set<Character> commonSet = new HashSet<>();
        for (char c : words[0].toCharArray()) {
            commonSet.add(c);
        }
        for (int i = 1; i < words.length; i++) {
            Set<Character> currentSet = new HashSet<>();
            for (char c : words[i].toCharArray()) {
                currentSet.add(c);
            }
            commonSet.retainAll(currentSet);
        }
        result.addAll(commonSet);
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "ample", "maple"};
        List<Character> commonChars = findCommonCharacters(words);
       System.out.println("Common characters: " + commonChars);
    }
}


/*
def find_common_characters(words):
    result = []
    if words is None or len(words) == 0:
        return result
    common_set = set(words[0])
    for i in range(1, len(words)):
        current_set = set(words[i])
        common_set = common_set.intersection(current_set)
    result.extend(common_set)
    return result

# Driver code
words = ["apple", "ample", "maple"]
common_chars = find_common_characters(words)
print("Common characters:", common_chars)

| Complexity           | Value        |
| -------------------- | ------------ |
| **Time Complexity**  | **O(n × m)** |
| **Space Complexity** | **O(m)**     |
*/