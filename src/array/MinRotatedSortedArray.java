package array;

public class MinRotatedSortedArray {
    public static int findMin(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        int l = 0, h = n - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            min = Math.min(min, arr[m]);
            if (arr[l] > arr[h] && arr[m] > arr[h]) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
//        int[] arr = {3, 4, 5, 1, 2};
//        int[] arr = {3, 4, 5, 6, 7, 8, 1, 2};
        int[] arr = {3, 4, 5, 6, 7, 8, 9, 10, 11, 1, 2};
//        int[] arr = {10, 20, 30, 40, 50, 5, 7};
        System.out.println(findMin(arr, arr.length));
    }
}
