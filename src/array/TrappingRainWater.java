package array;

public class TrappingRainWater {
    static long trappingWater(int[] arr, int n) {
        long collection = 0;
        int max = 0;
        int[] left = new int[n], right = new int[n];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            left[i] = max;
        }
        max = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (max < arr[i]) {
                max = arr[i];
            }
            right[i] = max;
        }
        for (int i = 0; i < n; i++) {
            collection += Math.min(left[i], right[i]) - arr[i];
        }
        return collection;
    }

    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 0, 2, 0, 4, 0, 1};
        System.out.println(trappingWater(arr, arr.length));
    }
}
