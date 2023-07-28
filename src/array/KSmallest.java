package array;

import java.util.Collections;
import java.util.PriorityQueue;

public class KSmallest {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = l; i < k; i++) {
            maxHeap.add(arr[i]);
        }
        for (int i = k; i <= r; i++) {
            if (maxHeap.peek() > arr[i]) {
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        System.out.println(kthSmallest(arr, 0, arr.length - 1, 3));
    }
}
