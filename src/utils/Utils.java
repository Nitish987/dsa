package utils;

public class Utils {
    public static <T> void printArray(T[] arr) {
        for (T obj: arr) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
