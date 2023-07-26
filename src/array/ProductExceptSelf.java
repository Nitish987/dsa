package array;// https://practice.geeksforgeeks.org/problems/product-array-puzzle4525/1?page=1&difficulty[]=0&category[]=Mathematical&sortBy=submissions

public class ProductExceptSelf {
    public static long[] productExceptSelf(int nums[], int n) {
        long m = 1, array[] = new long[n];
        int neglect = nums[0];
        int zeros = 0;
        for (int i = 1; i < n; i++) {
            m = m * (long) nums[i];
            if (nums[i] == 0) zeros++;
        }
        array[0] = m;
        if (neglect != 0 && m != 0) {
            for (int i = 1; i < n; i++) {
                m = (m * neglect) / nums[i];
                neglect = nums[i];
                array[i] = m;
            }
        } else if(neglect == 0 && m != 0) {
            for (int i = 1; i < n; i++) {
                array[i] = 0;
            }
        } else if(neglect != 0 && zeros == 1) {
            int idx = 1;
            long temp = 1;
            while (nums[idx] != 0) {
                array[idx] = 0;
                temp *= nums[idx];
                idx++;
            }
            for (int i = idx + 1; i < n; i++) {
                array[i] = 0;
                temp *= nums[i];
            }
            array[idx] = temp * (long) neglect;
        } else {
            for (int i = 1; i < n; i++) {
                array[i] = 0;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int nums[] = {8, 1, 1, 3, 1, 5, 8, 1, 3, 3, 9 ,7, 5, 4, 4, 9, 6 ,7 ,2 ,1 ,0 ,1 ,3 ,7};;
        long a[] = productExceptSelf(nums, nums.length);
        for (long i : a) {
            System.out.print(i + " ");
        }
    }
}
