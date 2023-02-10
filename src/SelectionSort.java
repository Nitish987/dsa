// Selection sort
// https://practice.geeksforgeeks.org/problems/selection-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=selection-sort
public class SelectionSort {
    static int select(int arr[], int i)
    {
        int minIdx = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIdx])
                minIdx = j;
        }
        return minIdx;
    }

    static void selectionSort(int arr[], int n)
    {
        for (int i = 0; i < n - 1; i++) {
            int minIdx = select(arr, i);
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,4,7,9};
        selectionSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Time Complexity : O(n^2)