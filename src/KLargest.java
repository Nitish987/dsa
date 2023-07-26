import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KLargest {
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }
        for (int i = k; i < n; i++) {
            if (minHeap.peek() < arr[i]) {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(minHeap);
        list.sort(Comparator.reverseOrder());
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 787, 1, 23};
        System.out.println(kLargest(arr, arr.length, 2));
    }
}
