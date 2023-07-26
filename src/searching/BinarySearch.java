package searching;// Binary Search
// https://practice.geeksforgeeks.org/problems/who-will-win-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=who-will-win

public class BinarySearch {
    static int searchInSorted(int arr[], int N, int K)
    {
        int l = 0, h = N - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (arr[m] == K)
                return m;
            if (arr[m] < K)
                l = m + 1;
            else
                h = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(searchInSorted(arr, arr.length, 6));
    }
}

// Time Complexity : O(log(n))
