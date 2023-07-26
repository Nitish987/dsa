package array;

import java.util.ArrayList;

public class CommonElements {
    public static ArrayList<Integer> commonElements(int[] A, int[] B, int[] C, int n1, int n2, int n3)
    {
        ArrayList<Integer> common = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        int preCommon = Integer.MIN_VALUE;
        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
                if (A[i] != preCommon) {
                    common.add(A[i]);
                    preCommon = A[i];
                }
                i++;
                j++;
                k++;
            } else if (A[i] < B[j]) {
                i++;
            } else if(B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }
        return common;
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
//        int[] A = {3, 3, 3};
//        int[] B = {3, 3, 3};
//        int[] C = {3, 3, 3};
        System.out.println(commonElements(A, B, C, A.length, B.length, C.length));
    }
}
