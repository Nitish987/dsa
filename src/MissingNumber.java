// https://practice.geeksforgeeks.org/problems/missing-number4257/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=missing-number

public class MissingNumber {
    public static int missingNumber(int A[], int N)
    {
        int sum = ((N + 1) * (N + 2)) / 2;
        for (int i = 0; i < N; i++) {
            sum = sum - A[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = {1, 4, 3};
        System.out.println(missingNumber(A, A.length));
    }
}
