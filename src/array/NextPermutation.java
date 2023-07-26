package array;

import java.util.ArrayList;
import java.util.List;

public class NextPermutation {
    static void reverse(int[] arr, int N, int j, int k) {
        for (int l = 0; l < N; l++) {
            int t = arr[j];
            arr[j] = arr[k];
            arr[k] = t;
            k--;
            j++;
        }
    }

    static List<Integer> nextPermutation(int N, int[] arr){
        List<Integer> list = new ArrayList<>();
        int i = -1; // i is pivot index
        for (int j = N - 2; j >= 0; j--) {
            if (arr[j] < arr[j + 1]) {
                i = j;
                break;
            }
        }

        // if no pivot index found means no permutation found
        if (i == -1) {
            reverse(arr, N / 2, 0, N - 1);
            for (int val: arr) {
                list.add(val);
            }
            return  list;
        }

        // swapping slightly greater element from i th index value
        for (int j = N - 1; j >= i; j--) {
            if(arr[j] > arr[i]) {
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
                break;
            }
        }
        // reversing arr from i + 1 index to N - 1
        reverse(arr, (N - i) / 2, i + 1, N - 1);
        for (int val: arr) {
            list.add(val);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        System.out.println(nextPermutation(arr.length, arr));
    }
}
