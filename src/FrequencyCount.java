import java.util.HashMap;
import java.util.Map;

// https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0

public class FrequencyCount {
    public static void frequencyCount(int arr[], int N, int P) {
        int count;
        int[] pArr = new int[N];
        for (int i = 1; i <= N; i++) {
            count = 0;
            for (int j = 0; j < N; j++) {
                if (i == arr[j]) {
                    count++;
                }
            }
            pArr[i - 1] = count;
        }
        System.arraycopy(pArr, 0, arr, 0, N);
    }

    public static void frequencyCount2(int arr[], int N, int P) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < N; i++) {
            counts.put(arr[i], counts.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < N; i++) {
            if (counts.containsKey(i + 1)) {
                arr[i] = counts.get(i + 1);
            } else {
                arr[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 2, 1};
        frequencyCount2(arr, arr.length, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
