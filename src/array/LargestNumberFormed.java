package array;

import java.util.Arrays;

public class LargestNumberFormed {
    static String printLargest(String[] arr) {
        Arrays.sort(arr, (a, b) -> {
            String ab = a + b;
            String ba = b + a;
            return ab.compareTo(ba) > 0 ? -1: 1;
        });
        StringBuilder number = new StringBuilder();
        for (String s : arr) {
            number.append(s);
        }
        return number.toString();
    }

    static void printArray(String[] arr) {
        for (String s: arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] arr = {"3", "30", "34", "5", "9"};
//        String[] arr = {"54", "546", "548", "60"};
        System.out.println(printLargest(arr));
    }
}
