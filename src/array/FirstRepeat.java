package array;

import java.util.*;
public class FirstRepeat {
    public static int firstRepeated(int[] arr, int n) {
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (freq.get(arr[i]) > 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8,5,6};
        System.out.println(FirstRepeat.firstRepeated(arr, arr.length));
    }
}
