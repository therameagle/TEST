package array;
import java.util.*;

public class A42_ListToArrayInteger {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Integer[] array = list.toArray(new Integer[0]);

        System.out.println("Integer array:");
        for (Integer num : array) {
            System.out.println(num);
        }
    }
}

/*
def list_to_array_integer():
    # Python list (equivalent to Java List<Integer>)
    lst = [1, 2, 3, 4, 5]
    # Convert list to array (Python list itself works as an array)
    array = list(lst)
    print("Integer array:")
    for num in array:
        print(num)

# Driver code
list_to_array_integer()


*/