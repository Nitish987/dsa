package array;// https://practice.geeksforgeeks.org/problems/maximize-number-of-1s0905/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=maximize-number-of-1s

public class MaximumNumberOne {
    static int findZeroes(int arr[], int n, int m) {
        int max = 0, i = 0, j = 0, count = 0;
        while (j < n) {
            if (arr[j] == 0) {
                count++;
            }
            while (count > m) {
                if (arr[i] == 0) {
                    count--;
                }
                i++;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1};
        System.out.println(findZeroes(arr, arr.length, 1));
    }
}
