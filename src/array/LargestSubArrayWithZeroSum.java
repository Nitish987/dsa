package array;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWithZeroSum {

    public static int maxLen(int[] arr) {
        if (arr.length == 1 && arr[0] == 0) {
            return 1;
        }

        int sum = 0, max = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (sum == 0) {
                max = i + 1;
            }

            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return max == Integer.MIN_VALUE ? 0: max;
    }

    public static void main(String[] args) {
        int[] arr = {-31, -48, -90, 54, 20, 95, 6, -86, 22};
        System.out.println(maxLen(arr));
    }
}
