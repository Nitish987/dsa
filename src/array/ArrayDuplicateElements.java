package array;// program whether the array contains dublicate elements or not.
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class ArrayDuplicateElements {

    public static boolean isDuplicate(Integer[] numbs) {
        Set<Integer> myset = new HashSet<>();
        Collections.addAll(myset, numbs);
        return myset.size() != numbs.length;
    }

    public static void main(String[] args) {
        Integer[] numbs = {1, 2, 1, 3, 4, 5};
        System.out.println(isDuplicate(numbs));
    }
}

// Time complexity : O(n)