package array;

import java.util.Arrays;

public class TripletSum {
    public static boolean find3Numbers(int[] A, int n, int X) {
        Arrays.sort(A);
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            while(j < k) {
                int sum = A[i] + A[j] + A[k];
                if (sum == X) {
                    return true;
                } else if (sum < X) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        System.out.println(find3Numbers(arr, arr.length, 13));
    }
}
