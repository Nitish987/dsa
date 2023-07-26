package recursion;

// Tail Recursion Example
public class TailRecursion {
    public static void tail(int n) {
        if (n > 0) {
            System.out.println(n);
            tail(n - 1);
        }
    }

    public static void main(String[] args) {
        tail(5);
    }
}

// Time Complexity : O(n)