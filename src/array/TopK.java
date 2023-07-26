package array;

import java.util.*;

// https://practice.geeksforgeeks.org/problems/top-k-frequent-elements-in-array/1

public class TopK {
    public static int[] topK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> frequency = new ArrayList<>();
        for (int i = 0; i < nums.length + 1; i++) {
            frequency.add(new ArrayList<>());
        }
        for (int n : map.keySet()) {
            frequency.get(map.get(n)).add(n);
        }
        int count = 0, idx = 0;
        int[] arr = new int[k];
        for (int i = frequency.size() - 1; i >= 0; i--) {
            if (frequency.get(i).size() > 1) {
                frequency.get(i).sort(Collections.reverseOrder());
            }
            for (int ele : frequency.get(i)) {
                count++;
                arr[idx++] = ele;
                if (count == k)
                    return arr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int[] ks = topK(arr, 2);
        for (int i = 0; i < 2; i++) {
            System.out.print(ks[i] + " ");
        }
    }
}
