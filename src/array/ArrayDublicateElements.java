package array;// program whether the array contains dublicate elements or not.
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class ArrayDublicateElements {
    public static boolean isDublicate(Integer[] numbs) {
        Set<Integer> myset = new HashSet<>();
        Collections.addAll(myset, numbs);
        return myset.size() != numbs.length;
    }
    public static void main(String[] args) {
        Integer[] numbs = {1, 2, 1, 3, 4, 5};
        System.out.println(isDublicate(numbs));
    }
}

// Time complexity : O(n)