package array;

import java.util.HashMap;
import java.util.Map;

public class LongSubArrayWithDivK {
    static int longSubarrWthSumDivByK(int[] a, int n, int k)
    {
        int max = 0, sum = 0, mod;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
            mod = ((sum % k) + k) % k;
            if (mod == 0) {
                max = i + 1;
            }
            if (map.containsKey(mod)) {
                max = Math.max(max, i - map.get(mod));
            } else {
                map.put(mod, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {2, 7, 6, 1, 4, 5};
//        int[] a = {-2, 2, -5, 12, -11, -1, 7};
        System.out.println(longSubarrWthSumDivByK(a, a.length, 3));
    }
}
