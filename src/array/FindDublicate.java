package array;

import java.util.*;
public class FindDublicate {
    public static ArrayList<Integer> duplicates(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Set<Integer> list = new TreeSet<>();
        for(int i = 0; i < n; i++) {
            if(map.get(arr[i]) > 1) {
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()) {
            list.add(-1);
        }
        return new ArrayList<Integer>(list);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 2};
        System.out.println(duplicates(arr, arr.length));
    }
}
