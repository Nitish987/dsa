package array;

/*
Question: Find the Missing Number
You are given a list of n-1 integers from 1 to n with no duplicates. One integer is missing from the list. Write a function to find the missing number.

Example:
Input: [1, 2, 4, 6, 3, 7, 8]
Output: 5
 */
public class FindMissing {
    public static int noDuplicates(int[] arr) {
        boolean[] nums = new boolean[arr.length + 2];
        for (int j : arr) {
            nums[j] = true;
        }
        for(int i = 1; i < nums.length + 2; i++) {
            if (!nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8, 5, 10};
        System.out.println(noDuplicates(arr));
    }
}
