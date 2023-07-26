package sorting;// Insertion Sort
// https://practice.geeksforgeeks.org/problems/insertion-sort/0?category[]=Algorithms&page=1&query=category[]Algorithmspage1&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=insertion-sort

public class InsertionSort {
    public static void insert(int arr[],int i)
    {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }

    public static void insertionSort(int arr[], int n)
    {
        for (int i = 1; i < n; i++) {
            insert(arr, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,4,7,9};
        insertionSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Time Complexity : O(n^2)
