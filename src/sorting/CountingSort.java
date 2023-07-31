package sorting;

public class CountingSort {
    public static void countingSort(int[] arr, int n) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int[] count = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,1,4,7,9};
        countingSort(arr, arr.length);
        printArray(arr);
    }
}
