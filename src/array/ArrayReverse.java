package array;

// program to reverse the array
public class ArrayReverse {
    public static void reverseArray(int[] arr) {
        int temp, start = 0, end = arr.length - 1;
        
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 345, 34745, 50456, 433, 230};
        printArray(arr);
        reverseArray(arr);
        printArray(arr);
    }
}

// Time Complexity : O(n)
