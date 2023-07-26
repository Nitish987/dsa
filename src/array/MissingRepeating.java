package array;

public class MissingRepeating {
    public static int[] findTwoElement(int[] arr, int n) {
        int[] counts = new int[n + 1];
        for(int i = 0; i < n; i++) {
            counts[arr[i]]++;
        }
        int[] e = new int[2];
        for(int i = 1; i < n + 1; i++) {
            if (counts[i] > 1) {
                e[0] = i;
            }
            if (counts[i] == 0) {
                e[1] = i;
            }
        }
        return e;
    }

    public static void printArray(int[] arr) {
        for(int item: arr) {
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 2};
        printArray(findTwoElement(arr, arr.length));
    }
}
