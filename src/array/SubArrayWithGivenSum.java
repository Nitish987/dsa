package array;

import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k

public class SubArrayWithGivenSum {
    public static int lenOfLongSubarr(int A[], int N, int K) {
        int sum = 0, max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            sum = sum + A[i];
            if (sum == K) {
                max = i + 1;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if (map.containsKey(sum - K)) {
                max = Math.max(max, (i - map.get(sum - K)));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = {10, 5, 2, 7, 1, 9};
        System.out.println(lenOfLongSubarr(A, A.length, 15));
    }
}
