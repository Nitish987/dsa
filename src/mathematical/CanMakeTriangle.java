package mathematical;

// Given an array A[] of N elements, You'd like to know how many triangles can be formed with side lengths equal to adjacent elements from A[].
//Construct an array of integers of length N - 2 where ith element is equal to 1 if it is possible to form a triangle with side lengths A[i], A[i+1], and A[i+2]. otherwise 0.
// https://practice.geeksforgeeks.org/problems/51b7f8fb8b33d657a857f230361b7dad6565ce62/1?page=1&category[]=Mathematical&sortBy=accuracy
public class CanMakeTriangle {
    public static int[] canMakeTriangle(int A[], int N)
    {
        int[] tra = new int[N - 2];
        for(int i = 0; i < N - 2; i++) {
            if (A[i] + A[i + 1] > A[i + 2] &&
                    A[i] + A[i + 2] > A[i + 1] &&
                    A[i + 1] + A[i + 2] > A[i]) {
                tra[i] = 1;
            } else {
                tra[i] = 0;
            }
        }
        return tra;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 4};
        int[] tra = canMakeTriangle(a, a.length);
        for (int i: tra) {
            System.out.printf("%d ",i);
        }
    }
}
