package array;

public class EqualOneZero {
    static int countSubArrWithEqualZeroAndOne(int[] arr, int n)
    {
        int i = 0, j = 0, ci = 0, cj = 0, count = 0;
        while(j < n) {
            i = j;
            while(i < n) {
                if (arr[i] == 1) {
                    ci++;
                } else {
                    cj++;
                }
                if (ci == cj) {
                    count++;
                }
                i++;
            }
            ci = 0;
            cj = 0;
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {1,0,0,1,0,1,1};
//        int[] A = {0,0,1,1,0};
        System.out.println(countSubArrWithEqualZeroAndOne(A, A.length));
    }
}
