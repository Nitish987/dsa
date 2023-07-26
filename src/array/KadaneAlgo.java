package array;

// Kadane's Algorithm
// https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&status[]=solved&sortBy=submissions
public class KadaneAlgo {
    public static long maxSubArraySum(int[] arr, int n){

        // Your code here
        long max = Long.MIN_VALUE, sum = 0;
        for (int j : arr) {
            sum = sum + j;
            if (max < sum) max = sum;
            if (sum < 0) sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1, 30, -12, 8, 4, 6, 3, 22, 2, -2, 2};
        long max = maxSubArraySum(a, a.length);
        System.out.println(max);
    }
}
