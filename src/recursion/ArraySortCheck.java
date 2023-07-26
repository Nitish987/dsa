package recursion;

// program to check if an array is sorted (Strictly Increasing)
public class ArraySortCheck {
    public static boolean isSorted(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] >= arr[idx + 1]) {
            return false;
        }
        return isSorted(arr, idx + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, 0));
    }
}

// Time Complexity : O(n)
