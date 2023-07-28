package array;

public class MaxProductSubArray {
    public static long maxProduct(int[] arr, int n) {
        if (n == 1) return arr[0];
        long pre = 1, suf = 1, max = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suf == 0) suf = 1;
            pre *= arr[i];
            suf *= arr[n - 1 - i];
            max = Math.max(max, Math.max(pre, suf));
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {6, -3, -10, 0, 2};
//        int[] arr = {100, -1, 10000};
        System.out.println(maxProduct(arr, arr.length));
    }
}
