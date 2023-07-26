package mathematical;

// Given two positive integers A and B, find mathematical.GCD of A and B.
// https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
public class GCD {
    public static int gcd(int A , int B)
    {
        int t = 0;
        while(B != 0) {
            t = B;
            B = A % B;
            A = t;
        }
        return A;
    }

    public static void main(String[] args) {
        System.out.println(gcd(16, 14));
    }
}
