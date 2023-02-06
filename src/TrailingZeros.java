// For an integer N find the number of trailing zeroes in N!.
// https://practice.geeksforgeeks.org/problems/trailing-zeroes-in-factorial5134/1
public class TrailingZeros {
    static int trailingZeroes(int N) {
        int c = 0, x = 5;
        while(x <= N) {
            c = c + (N/x);
            x *=5;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(30));
    }
}
