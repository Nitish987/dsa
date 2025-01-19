package array;

// https://www.interviewbit.com/problems/subarray-with-given-xor/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArraysXor {

    public static int solve(ArrayList<Integer> A, int B) {
        int n = A.size(), count = 0, xr = 0;

        Map<Integer, Integer> xorMap = new HashMap<>();
        xorMap.put(xr, 1);

        for (int i = 0; i < n; i++) {
            xr = xr ^ A.get(i);
            int x = xr ^ B;

            if (xorMap.containsKey(x)) {
                count += xorMap.get(x);
            }

            xorMap.put(xr, xorMap.getOrDefault(xr, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(4, 2, 2, 6, 4));
        System.out.println(solve(A, 6));
    }
}
