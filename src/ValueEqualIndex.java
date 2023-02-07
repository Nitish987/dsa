import java.util.ArrayList;
// Task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing )
// https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1?page=1&difficulty[]=-2&sortBy=submissions
public class ValueEqualIndex {
    static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> elements = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == i + 1) {
                elements.add(arr[i]);
            }
        }
        return elements;
    }

    public static void main(String[] args) {
        int[] arr = {15, 2, 45, 12, 7};
        System.out.println(valueEqualToIndex(arr, arr.length));
    }
}
