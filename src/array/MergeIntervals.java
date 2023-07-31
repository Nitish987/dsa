package array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static int[][] overlappedInterval(int[][] Intervals) {
        if (Intervals.length == 1) {
            return Intervals;
        }

        Arrays.sort(Intervals, (ints1, ints2) -> ints1[0] - ints2[0]);
        ArrayList<int[]> ranges = new ArrayList<>();

        int i = 0, j, cx, cy, nx, ny;
        while (i < Intervals.length - 1) {
            j = i;
            cx = Intervals[j][0];
            cy = Intervals[j][1];
            nx = Intervals[j + 1][0];
            ny = Intervals[j + 1][1];
            boolean executed = false;
            while (j < Intervals.length - 1 && nx >= cx && nx <= cy) {
                executed = true;
                if (ny > cy) {
                    cy = ny;
                }
                j++;
                nx = Intervals[j][0];
                ny = Intervals[j][1];
            }
            ranges.add(new int[] {cx, cy});
            if (!executed) {
                j++;
            }
            i = j;
        }
        int[] last = ranges.get(ranges.size() - 1);
        cx = last[0];
        cy = last[1];
        nx = Intervals[i][0];
        ny = Intervals[i][1];
        if (nx >= cx && nx <= cy) {
            if (ny > cy) {
                cy = ny;
                ranges.remove(ranges.size() - 1);
                ranges.add(new int[] {cx, cy});
            }
        } else {
            ranges.add(Intervals[i]);
        }

        int[][] array = new int[ranges.size()][2];
        array = ranges.toArray(array);
        return array;
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
