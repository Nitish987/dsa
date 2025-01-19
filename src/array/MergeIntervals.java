package array;

import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/merge-intervals/

public class MergeIntervals {
    public static int[][] overlappedInterval(int[][] Intervals) {
        if (Intervals.length == 1) {
            return Intervals;
        }

        Arrays.sort(Intervals, (ints1, ints2) -> ints1[0] - ints2[0]);
        ArrayList<int[]> ranges = new ArrayList<>();

        for (int i = 0; i < Intervals.length; i++) {
            int s = Intervals[i][0];
            int e = Intervals[i][1];

            while (i + 1 < Intervals.length && e >= Intervals[i + 1][0]) {
                if (e < Intervals[i + 1][1]) {
                    e = Intervals[i + 1][1];
                }
                i++;
            }

            ranges.add(new int[]{s, e});
        }

        int[][] array = new int[ranges.size()][2];
        return ranges.toArray(array);
    }

    public static void printArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] intervals = {{11, 47},{2, 25},{27, 34},{6, 31},{16, 25},{26, 38},{38, 44},{39, 48},{17, 38},{48, 49},{3, 44}};
//        int[][] intervals = {{0,1},{1,3},{2,4},{6,8},{9,10},{10,11}};
//        int[][] intervals = {{6,8},{1,9},{2,4},{4,7}};
//        int[][] intervals = {{6,8},{1,2}};
        int[][] result = overlappedInterval(intervals);
        for (int[] ints : result) {
            printArray(ints);
        }
    }
}

// Time Complexity -  O(n * log(n))
