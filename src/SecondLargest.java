import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/second-largest3735/1?page=1&difficulty[]=-2&sortBy=submissions
// Second Largest in an array

public class SecondLargest {
    static int print2largest(int arr[], int n) {
        Arrays.sort(arr);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1])
                return arr[i];
        }
        return arr[n - 2];
    }

    static int print2largest2(int arr[], int n) {
        int first = arr[0], second = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }
        if (second == first || second == 0) return -1;
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {4, 34, 34, 34, 34, 34};
        System.out.println(print2largest2(arr, arr.length));
    }
}
