package array;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeat {
    public static int firstNonRepeated(int[] arr, int n) {
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (freq.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -17, -12, 8, 16, -17, -13, -14, -3, -6, -5, -11, -10, -12, -5, 19, -17, -5, -1, 12};
        System.out.println(FirstNonRepeat.firstNonRepeated(arr, arr.length));
    }
}
