package array;

// program to find maximum and minimum in the array
public class ArrayMaxMin {
    public static class Pair {
        int max;
        int min;
    }

    public static Pair getMaxMin(int[] arr) {
        Pair pair = new Pair();
        int n = arr.length;
        
        if (n == 1) {
            pair.max = arr[0];
            pair.min = arr[0];
            return pair;
        }

        if (arr[0] > arr[1]) {
            pair.max = arr[0];
            pair.min = arr[1];
        } else {
            pair.max = arr[1];
            pair.min = arr[0];
        }

        for (int i = 2; i < n; i++) {
            if (arr[i] > pair.max) pair.max = arr[i];
            else if (arr[i] < pair.min) pair.min = arr[i];
        }

        return pair;
    }
    public static void main(String[] args) {
        int[] arr = {12, 345, 34745, 50456, 433, 230};
        Pair pair = getMaxMin(arr);
        System.out.printf("Maximum : %d\n", pair.max);
        System.out.printf("Minimum : %d\n", pair.min);
    }
}

// Time complexity : O(n)